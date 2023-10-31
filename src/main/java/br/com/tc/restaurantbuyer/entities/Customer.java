package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<UserClient> userClient = new ArrayList<>();
    private String cnpj;
    private BigDecimal authorizedBudget;

    public Customer(String name, String cnpj, BigDecimal authorizedBudget) {
        this.name = name;
        this.cnpj = cnpj;
        this.authorizedBudget = authorizedBudget;
    }
}