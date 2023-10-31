package br.com.tc.restaurantbuyer.controller;

import br.com.tc.restaurantbuyer.dto.CustomerDTO;
import br.com.tc.restaurantbuyer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerController {

    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        Assert.notNull(customerService, "CustomerService must not be null!");
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDTO> listAllCustomers() {
        log.debug("Find all customers  ");
        return customerService.listAllCustomers();
    }

    @PostMapping
    public CustomerDTO createProduct(@RequestBody CustomerDTO customerDTO) {
        return customerService.createCustomer(customerDTO);
    }
}
