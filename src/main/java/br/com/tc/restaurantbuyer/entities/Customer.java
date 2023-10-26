package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy ="customer", cascade = CascadeType.ALL)
    private List<UserClient> userClient = new ArrayList<>();
    private String cnpj;
    private BigDecimal authorizedBudget;

}
