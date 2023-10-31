package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "product")
@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String units;
    //TODO podemos usar string, tabela de dominio, ou enum
    private String category;

    public Product(String name, String units, String category) {
        this.name = name;
        this.units = units;
        this.category = category;
    }
    //private Category categoryAsEnum;
}
