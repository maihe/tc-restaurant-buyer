package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String cnpj;
    private BigDecimal authorizedBudget;
    private String address;
    private String name;
    private String email;

    @OneToMany(mappedBy ="customer")
    private Set<ProductCustomer> productCustomers;
}
