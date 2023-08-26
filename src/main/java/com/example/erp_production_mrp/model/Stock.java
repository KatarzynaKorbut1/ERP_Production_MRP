package com.example.erp_production_mrp.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
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

public class Stock {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long stockId;

    @Column




    @ManyToMany(mappedBy = "stockSet")
    private Set<Storage> storageSet = new HashSet<>();



}
