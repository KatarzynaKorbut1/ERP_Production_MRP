package com.example.erp_production_mrp.model;
import jakarta.persistence.*;
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

public class Structure {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long structureId;

    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "structure_id")
    @JoinTable(name = "structure_item",
    joinColumns = @JoinColumn(name = "structure_id"),
    inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> components;
//    private Set<Item> components = new HashSet<>();

    @Column
    private Long materialConsumptionStandard;

}

