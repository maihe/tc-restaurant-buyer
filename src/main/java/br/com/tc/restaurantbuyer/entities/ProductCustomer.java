package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "product_customer")
@Entity
@Data
@NoArgsConstructor
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
    @Column(name = "obs")
    private String obs;

    public ProductCustomer(Long productId, Long customerId, int quantity, Integer maxQuantity, Integer minQuantity, String obs) {
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
        this.minQuantity = minQuantity;
        this.obs = obs;
    }
}
