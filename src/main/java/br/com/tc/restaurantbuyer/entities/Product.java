package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String units;
    //TODO podemos usar string, tabela de dominio, ou enum
    private String category;
    //private Category categoryAsEnum;
}
