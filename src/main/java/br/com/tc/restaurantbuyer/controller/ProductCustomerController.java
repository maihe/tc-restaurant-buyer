package br.com.tc.restaurantbuyer.controller;

import br.com.tc.restaurantbuyer.entities.ProductCustomer;
import br.com.tc.restaurantbuyer.service.ProductCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products_customer/{customerId}")
public class ProductCustomerController {

    ProductCustomerService productCustomerService;

    @Autowired
    public ProductCustomerController(ProductCustomerService productCustomerService) {
        Assert.notNull(productCustomerService, "ProductService must not be null!");
        this.productCustomerService = productCustomerService;
    }
    @GetMapping
    public List<ProductCustomer> listAllProducts(@PathVariable("customerId") Long customerId) {
        log.debug("Find all products from restaurant {}", customerId);
        return productCustomerService.listAllProductCustomer(customerId);
    }

}
