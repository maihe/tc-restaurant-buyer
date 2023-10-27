package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Entity
public class UserClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userclient_id")
    private long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //TODO podemos usar string, tabela de roles, ou enum
    private String role;
    //private Role role;
}
