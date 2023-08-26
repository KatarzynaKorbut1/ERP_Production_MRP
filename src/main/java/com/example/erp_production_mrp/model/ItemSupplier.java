package com.example.erp_production_mrp.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ItemSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemSuppId;

    @Column(name = "item_id")
    Long itemId;

    @Column(name = "supplier_id")
    Long suppId;

    @DateTimeFormat(pattern = "yyy-MM-dd")
    private LocalDate amtOfDeliveryDay;



    public ItemSupplier(LocalDate amtOfDeliveryDay) {
        this.amtOfDeliveryDay = amtOfDeliveryDay;
    }

    // określić dlugosc znaków (w adnotacji kolumny) name="", lenght=
    //join column, połączyć, not empty zrobic walidacje
}
