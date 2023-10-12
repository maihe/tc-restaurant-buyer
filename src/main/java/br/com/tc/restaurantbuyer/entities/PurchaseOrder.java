package br.com.tc.restaurantbuyer.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Table(name = "product_order")
@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //TODO a relacao de produtos comprados precisa de outra entidade?
    // ex: product_ordered (id_produto_fk, qnt)
    // ex: shopping_list (id_produto_fk, qnt, restaurant_id_fk, create_date, update_date)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> productList;
    private BigDecimal totalValue;
    private LocalDate deliveryDate;

    @ManyToOne
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}
