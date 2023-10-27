package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Entity
public class ProductCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "max_quantity")
    private Integer maxQuantity;

    @Column(name = "min_quantity")
    private Integer minQuantity;
}
