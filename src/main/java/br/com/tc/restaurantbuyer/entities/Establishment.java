package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Establishment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //TODO esse mapeamento ta causando erro ao subir,
    // esse e os demais precisamos revisar a forma correta
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private List<User> userList;
    private String cnpj;
    private BigDecimal authorizedBudget;

}
