package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
