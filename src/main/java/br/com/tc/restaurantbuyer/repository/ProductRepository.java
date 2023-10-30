package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameLikeIgnoreCase(String name);
}
