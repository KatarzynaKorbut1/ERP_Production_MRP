package com.example.erp_production_mrp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity

public class ProductionOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poId;

    @Column(name = "order_number", length = 15, unique = true, nullable = false)
    @NotEmpty
    private String orderNo;

    @Column(name = "status")
    @NotEmpty
    private StatusType statusType;

    @Column(name = "user_name")
    private String userName;


    @Column(name = "index_name")    // chcę pobierać to z listy
    private String index_name;

    @Column
    private Long quantity;

    @Column
    private BigDecimal cost;

    @Enumerated(EnumType.STRING)
    @Column(name = "unit")
    private Unit unit;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate requiredDate;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate stopDate;



}
