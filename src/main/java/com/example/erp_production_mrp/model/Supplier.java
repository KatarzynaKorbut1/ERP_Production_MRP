package com.example.erp_production_mrp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "supplier_id")
    private Long supplierId;
    @Column(name = "supplier_name")
    @NotEmpty
    private String supplierName;
    @Column
    @NotEmpty
    private String supplierAddress;
    @Column(length = 10, unique = true, nullable = false)
    @NotEmpty
    private String nip;
    //TODO create class account
//    @Column(length = 26, unique = true, nullable = false )
//    Account account;
    @Enumerated(EnumType.STRING)
    private Tax tax;
    @Column
    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "item_supplier", joinColumns = @JoinColumn(name = "supplier_id"),
    inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<Item> items;




}
