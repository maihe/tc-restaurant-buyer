package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Table(name = "supllier")
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "cnpj")
    private String cnpj;

}
