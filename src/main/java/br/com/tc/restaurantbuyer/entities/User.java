package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

@Data
@Entity
public class User {
    @Id
    private Long user_id;
    private String name;
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
