package br.com.tc.restaurantbuyer.repository;

import br.com.tc.restaurantbuyer.entities.PriceProduct;
import br.com.tc.restaurantbuyer.entities.Product;
import br.com.tc.restaurantbuyer.entities.Supplier;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceProductRepository extends PagingAndSortingRepository<PriceProduct, Long> {

    // buscar preços de um determinado produto
    List<PriceProduct> findByProduct(Product product);

    // buscar preços de um determinado fornecedor
    List<PriceProduct> findBySupplier(Supplier supplier);

    // buscar preços de um produto para um determinado fornecedor
    List<PriceProduct> findByProductAndSupplier(Product product, Supplier supplier);

    // buscar preços criados em uma data específica
    List<PriceProduct> findByCreatedAt(Date date);

}
