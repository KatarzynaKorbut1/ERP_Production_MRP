package com.example.erp_production_mrp.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Storage {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long storageId;
    @Column(name = "storage_name")
    @NotEmpty
    private String storageName;

    @Enumerated
    @Column(name = "type_of_storage")
    @NotEmpty
    private TypeOfStorage typeOfStorage;

    @ManyToMany
    @JoinTable(name = "stock_join", joinColumns =
    @JoinColumn(name = "storage_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<Stock> stockSet;



}
