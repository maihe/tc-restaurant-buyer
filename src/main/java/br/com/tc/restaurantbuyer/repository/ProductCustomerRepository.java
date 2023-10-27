package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.ProductCustomer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCustomerRepository extends PagingAndSortingRepository<ProductCustomer, Long> {
    //buscar todas as relações para um determinado produto:
    List<ProductCustomer> findByProduct(Product product);

    //buscar todas as relações para um determinado cliente:
    List<ProductCustomer> findByCustomer(Customer customer);
}
