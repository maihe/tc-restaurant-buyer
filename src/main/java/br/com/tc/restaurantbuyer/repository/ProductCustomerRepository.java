package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.dto.ProductDTO;
import br.com.tc.restaurantbuyer.entities.ProductCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCustomerRepository extends JpaRepository<ProductCustomer, Long> {

    List<ProductCustomer> findAllByCustomerId(Long customerId);

    @Query("SELECT DISTINCT p.id, p.name, p.units, pc.maxQuantity, pc.minQuantity, p.category, pc.obs FROM Product p INNER JOIN ProductCustomer pc ON p.id = pc.productId WHERE pc.customerId = ?1")
    List<ProductDTO> findAllProductSQLByCustomerId(Long customerId);
}
