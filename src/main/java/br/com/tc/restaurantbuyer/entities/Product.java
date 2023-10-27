package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String name;
    private String description;
    private String units;
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<ProductCustomer> productCustomers;

    @OneToMany(mappedBy = "product")
    private Set<PriceProduct> priceProducts;
}
