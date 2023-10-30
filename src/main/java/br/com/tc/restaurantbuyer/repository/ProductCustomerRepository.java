package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.ProductCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCustomerRepository extends JpaRepository<ProductCustomer, Long> {

    List<ProductCustomer> findAllByCustomerId(Long customerId);
}
