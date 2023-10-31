package br.com.tc.restaurantbuyer.service;

import br.com.tc.restaurantbuyer.dto.ProductDTO;
import br.com.tc.restaurantbuyer.entities.Product;
import br.com.tc.restaurantbuyer.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductCustomerService productCustomerService;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductCustomerService productCustomerService) {
        Assert.notNull(productRepository, "ProductRepository must not be null!");
        Assert.notNull(productCustomerService, "ProductCustomerService must not be null!");
        this.productRepository = productRepository;
        this.productCustomerService = productCustomerService;
    }

    public List<Product> listAllProduct(Long id) {
        return productRepository.findAllByCustomerId(id);
    }

    public ProductDTO createProduct(ProductDTO productDTO, Long customerId) {
        log.info("Creating Product {} ", productDTO.toString());
        try {
            Product product = productRepository.save(toProduct(productDTO));
            //productDTO = toProductDTO(product);
            productCustomerService.createProduct(productDTO, customerId, product.getId());

        } catch (Exception e) {
            log.error("Error saving new User {}", e.getCause());
            throw e;
        }
        return productDTO;
    }


    /*----------------------- MAPPERS -----------------------*/
    private ProductDTO toProductDTO(Product product) {
        return new ProductDTO(
                product.getName(),
                product.getUnits(),
                null,
                null,
                product.getCategory(),
                null);
    }

    private Product toProduct(ProductDTO productDTO) {
        return new Product(productDTO.name(),
                productDTO.units(),
                productDTO.category());
    }
}
