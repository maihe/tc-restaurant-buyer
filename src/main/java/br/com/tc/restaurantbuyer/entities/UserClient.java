package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class UserClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
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


    public UserClient(String login, String role, String password) {
        this.login = login;
        this.role = role;
        this.password = password;
    }

}