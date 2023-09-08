package com.example.erp_production_mrp.model;
import com.example.erp_production_mrp.serializer.ItemSerializer;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonSerialize(using = ItemSerializer.class)
public class Item{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Enumerated(EnumType.STRING)
    private TypeOfItem typeOfItem;

    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(name = "index_description")
    private String indexDescription;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "part_number")
    private String partNumber;

    @Column(name="index_number", length = 19, unique = true, nullable = false)
    @NotEmpty
    private String indexName;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")   //tutaj było "item" ale zmieniłam w celu sprawdzenia nie działającej bazy
    private List<Structure> structures = new ArrayList<>();

    @ManyToMany(/*cascade = {CascadeType.MERGE, CascadeType.PERSIST},*/
            fetch = FetchType.LAZY)

    //to poniżej wygeneruje nam automatycznie tabelę item_supplier
    @JoinTable(name = "item_supplier",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id"))

    private Set<Supplier> suppliers;



    public Item(TypeOfItem typeOfItem, Unit unit, String indexDescription, Long quantity, Double cost, String partNumber, String indexName) {
        this.typeOfItem = typeOfItem;
        this.unit = unit;
        this.indexDescription = indexDescription;
        this.quantity = quantity;
        this.cost = cost;
        this.partNumber = partNumber;
        this.indexName = indexName;

    }


}
