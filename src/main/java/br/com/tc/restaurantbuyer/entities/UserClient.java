package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Table(name = "user_client")
@Entity
public class UserClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    //TODO podemos usar string, tabela de roles, ou enum
    private String role;
    //private Role role;
}
