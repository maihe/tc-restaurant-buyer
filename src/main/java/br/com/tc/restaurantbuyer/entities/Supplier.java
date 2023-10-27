package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private long id;
    private String cnpj;
    private String address;
    private String name;
    private String email;
}
