package com.example.erp_production_mrp.model;

import com.example.erp_production_mrp.serializer.StructureSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = StructureSerializer.class)
public class Structure {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long structureId;

    private Long version;

    @DateTimeFormat(pattern = "yyyy-mm-dd")

    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-mm-dd")

    private LocalDate stopDate;


//    @ManyToMany
//    @JoinTable(name = "structure_component",
//            joinColumns = @JoinColumn(name = "structure_id"),
//            inverseJoinColumns = @JoinColumn(name = "component_id"))
//    private List<Component> components = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "structure_component_list_id")
    private StructureComponentList structureComponentList;

    //zablokować możliwość usunięcia pozycji gdy jest struktura
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Enumerated(EnumType.STRING)
    private StatusType statusType;





}

