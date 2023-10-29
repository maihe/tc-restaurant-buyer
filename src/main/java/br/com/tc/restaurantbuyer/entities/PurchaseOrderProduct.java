package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "purchase_order_product")
@Entity
public class PurchaseOrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "purchase_order_id")
    private Long purchaseOrderId;
    @Column(name = "product_id")
    private Long productId;
    private Integer quantityBuy;
    @Column(name = "price")
    private BigDecimal price;

}
