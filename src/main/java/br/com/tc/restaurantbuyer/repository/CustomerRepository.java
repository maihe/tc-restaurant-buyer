package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    List<Customer> findByNameIgnoreCase(String name);
}
