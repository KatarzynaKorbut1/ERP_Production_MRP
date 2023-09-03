package com.example.erp_production_mrp.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ItemSupplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemSuppId;

    @Column(name = "supplier_id")
    Long suppId;
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private LocalDate amtOfDeliveryDay;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST},
            fetch = FetchType.EAGER)
    @JoinTable(name = "item_join",
            joinColumns = @JoinColumn(name = "supplier_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))

    private Set<Item> items;

    public ItemSupplier(LocalDate amtOfDeliveryDay) {
        this.amtOfDeliveryDay = amtOfDeliveryDay;
    }
    // określić dlugosc znaków (w adnotacji kolumny) name="", lenght=
    //join column, połączyć, not empty zrobic walidacje

    public ItemSupplier(Long itemSuppId, LocalDate amtOfDeliveryDay, Set<Item> items) {
        this.itemSuppId = itemSuppId;
        this.amtOfDeliveryDay = amtOfDeliveryDay;
        this.items = items;
    }
}

