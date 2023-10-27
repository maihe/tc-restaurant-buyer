package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Entity
public class ProductCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "max_quantity")
    private Integer maxQuantity;
    @Column(name = "min_quantity")
    private Integer minQuantity;

}
