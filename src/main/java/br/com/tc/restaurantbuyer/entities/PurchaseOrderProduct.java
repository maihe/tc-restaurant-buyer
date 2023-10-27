package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class PurchaseOrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "product_id")
    private Long product;
    @Column(name = "purchase_order_id")
    private Long purchaseOrderId;
    private Integer quantityBuy;
    @Column(name = "price")
    private BigDecimal price;

}
