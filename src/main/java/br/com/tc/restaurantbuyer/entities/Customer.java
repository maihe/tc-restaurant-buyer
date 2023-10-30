package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<UserClient> userClient = new ArrayList<>();
    private String cnpj;
    private BigDecimal authorizedBudget;

}
