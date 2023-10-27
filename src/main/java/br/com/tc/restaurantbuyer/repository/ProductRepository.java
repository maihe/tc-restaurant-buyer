package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    List<Product> findAllByNameLikeIgnoreCase(String name);
}
