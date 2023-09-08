package com.example.erp_production_mrp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class StructureComponentList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long structureComponentListId;

    @Column(length = 16)
    private Long materialConsumptionStandard;

    //Jarek
    @OneToMany(mappedBy = "structureComponentList") //Jarek
    private List<Structure> structures = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "component_id")
    private Component component;









}
