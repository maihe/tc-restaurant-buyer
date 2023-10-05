package br.com.tc.restaurantbuyer.entities;

import br.com.tc.restaurantbuyer.entities.enums.Category;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "restaurant_uuid")
    private String restaurantUuid;
    private String name;
    private Integer quantity;
    private String units;
    @Column(name = "max_quantity")
    private Integer maxQuantity;

    @Column(name = "min_quantity")
    private Integer minQuantity;

    //TODO podemos usar string, tabela de dominio, ou enum
    private String category;
    //private Category categoryAsEnum;
}
