package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cnpj;

}
