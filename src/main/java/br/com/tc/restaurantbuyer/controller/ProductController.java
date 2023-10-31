package br.com.tc.restaurantbuyer.controller;

import br.com.tc.restaurantbuyer.dto.ProductDTO;
import br.com.tc.restaurantbuyer.entities.Product;
import br.com.tc.restaurantbuyer.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products/{customerId}")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        Assert.notNull(productService, "ProductService must not be null!");
        this.productService = productService;
    }
    @GetMapping
    public List<Product> listAllProducts(@PathVariable("customerId") Long customerId) {
        //List<ProductDTO> exampleProducts = new ArrayList<>();
        //ProductDTO  productDTO1 = new ProductDTO("Macarrao Barilla", "pct", 10,2,
        //        "mantinmentos", "Substituir por Adria");
        //exampleProducts.add(productDTO1);
        //return exampleProducts;
        log.debug("Find all products from restaurant {}", customerId);
        return productService.listAllProduct(customerId);
    }

    @PostMapping
    public ProductDTO createProduct(@PathVariable("customerId") Long customerId,
                                    @RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO, customerId);
    }
}
