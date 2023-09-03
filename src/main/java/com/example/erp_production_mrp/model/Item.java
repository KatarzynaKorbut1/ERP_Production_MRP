package com.example.erp_production_mrp.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Item {

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
    @ManyToMany(mappedBy = "items")
    private Set<Supplier> suppliers = new HashSet<>();

    @ManyToMany(mappedBy = "items")
    private Set<ItemSupplier> items = new HashSet<>();

    @ManyToMany(mappedBy = "items")
    private Set<ItemSupplier> items = new HashSet<>();

    @OneToMany
    private Set<Structure> structures;

    public Item(TypeOfItem typeOfItem, Unit unit, String indexDescription, Long quantity, Double cost, String partNumber, String indexName, Set<ItemSupplier> items) {
        this.typeOfItem = typeOfItem;
        this.unit = unit;
        this.indexDescription = indexDescription;
        this.quantity = quantity;
        this.cost = cost;
        this.partNumber = partNumber;
        this.indexName = indexName;
        this.items = items;
    }
}
