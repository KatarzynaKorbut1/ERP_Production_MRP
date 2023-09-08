package com.example.erp_production_mrp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "component_id")
    private Long componentId;

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

    @Column(name = "index_number", length = 19, unique = true, nullable = false)
    @NotEmpty
    private String indexName;

//    @Column(length = 16)
//    private Long materialConsumptionStandard;

//    @ManyToMany(mappedBy = "components")
//    @JoinColumn(name = "component_id")
//    private List<Structure> structures = new ArrayList<>();

    @OneToMany(mappedBy = "component")
    private List<StructureComponentList> structureComponentLists = new ArrayList<>();


    public Component(TypeOfItem typeOfItem, Unit unit, String indexDescription, Long quantity, Double cost, String partNumber, String indexName) {
        this.typeOfItem = typeOfItem;
        this.unit = unit;
        this.indexDescription = indexDescription;
        this.quantity = quantity;
        this.cost = cost;
        this.partNumber = partNumber;
        this.indexName = indexName;

    }
}



