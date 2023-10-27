package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "product_order")
@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PurchaseOrderProduct> purchaseOrderProductList;
    private BigDecimal totalValue;
    private LocalDate deliveryDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime updateDate;
}
