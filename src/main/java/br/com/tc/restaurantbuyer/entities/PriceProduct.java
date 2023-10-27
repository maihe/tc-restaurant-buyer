package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "price_product")
public class PriceProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

   @Column(name = "price")
   private BigDecimal price;

   @Column(name = "created_at")
   private Date created_at;

   @Column(name = "validated_at")
   private Date validated_at;
}
