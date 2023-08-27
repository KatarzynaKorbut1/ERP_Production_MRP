package com.example.erp_production_mrp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PurchasingOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchasing_order_id" )
    private Long id;

    @Column(name = "purch_no", length = 20, unique = true, nullable = false)
    private String purchasingNo;

    //@Enumerated(EnumType.STRING)
    //private StatusType statusType;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "index_name")
    private String indexName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private BigDecimal price;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
//    }public enum StatusType {
//
//        INITIAL, ACTIVATED, CANCELLED;

    //INITIAL, ACTIVATED, CANCELLED;



}
