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
   // @NotEmpty                         // nie puszcza z tą walidacją enuma na post
    @Enumerated(EnumType.STRING)
    private StatusType statusType;

    @Column(name = "user_name")
    @NotEmpty
    private String userName;


    @Column(name = "index_name")    // chcę pobierać to z listy
    private String indexName;

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

    public ProductionOrder(String orderNo, StatusType statusType, String userName, String indexName, Long quantity, LocalDate requiredDate, LocalDate startDate, LocalDate stopDate) {
        this.orderNo = orderNo;
        this.statusType = statusType;
        this.userName = userName;
        this.indexName = indexName;
        this.quantity = quantity;
        this.requiredDate = requiredDate;
        this.startDate = startDate;
        this.stopDate = stopDate;
    }


}
