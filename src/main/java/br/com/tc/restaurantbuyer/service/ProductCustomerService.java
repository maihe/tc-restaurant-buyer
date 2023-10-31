package br.com.tc.restaurantbuyer.service;

import br.com.tc.restaurantbuyer.dto.ProductDTO;
import br.com.tc.restaurantbuyer.entities.ProductCustomer;
import br.com.tc.restaurantbuyer.repository.ProductCustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Slf4j
@Service
public class ProductCustomerService {

    private final ProductCustomerRepository productCustomerRepository;

    //Construtor para testar sugestao de boas praticas de injecao
    @Autowired
    public ProductCustomerService(ProductCustomerRepository productCustomerRepository) {
        Assert.notNull(productCustomerRepository, "ProductCustomerRepository must not be null!");
        this.productCustomerRepository = productCustomerRepository;
    }

    public List<ProductCustomer> listAllProductCustomer(Long customerId) {
        //return productCustomerRepository.findAllProductSQLByCustomerId(customerId);
        return productCustomerRepository.findAllByCustomerId(customerId);
        //construir mapper
    }

    public ProductCustomer createProduct(ProductDTO productDTO, Long customerId, Long productId) {
        log.info("Creating Product Customer {} {}", customerId, productDTO);
        try {
            ProductCustomer product = productCustomerRepository.save(toProductCustomer(productDTO, customerId, productId));
            return product;
        } catch (Exception e) {
            log.error("Error saving new User {}", e.getCause());
            throw e;
        }
    }


    /*----------------------- MAPPERS -----------------------*/

    private ProductCustomer toProductCustomer(ProductDTO productDTO, Long customerId, Long productId) {
        return new ProductCustomer(productId,
                customerId,
                1,
                productDTO.maxQuantity(),
                productDTO.minQuantity(),
                productDTO.obs());
    }
}
