//package com.example.erp_production_mrp.model;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//import org.springframework.format.annotation.DateTimeFormat;
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//import java.time.LocalDate;
//import java.util.Set;
//
//
//@Entity
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//public class ItemSupplier {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long itemSuppId;
//
//    @Column(name = "supplier_id")
//    Long suppId;
//
//    @DateTimeFormat(pattern = "yyy-MM-dd")
//    private LocalDate amtOfDeliveryDay;
//
//
//    public ItemSupplier(LocalDate amtOfDeliveryDay) {
//        this.amtOfDeliveryDay = amtOfDeliveryDay;
//    }
//
//    public ItemSupplier(Long itemSuppId, LocalDate amtOfDeliveryDay) {
//        this.itemSuppId = itemSuppId;
//        this.amtOfDeliveryDay = amtOfDeliveryDay;
//
//    }
//}

