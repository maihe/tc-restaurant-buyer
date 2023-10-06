package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String login;
    private String password;

    //TODO podemos usar string, tabela de roles, ou enum
    private String role;
    //private Role role;
}
