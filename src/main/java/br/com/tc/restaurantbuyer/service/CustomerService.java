package br.com.tc.restaurantbuyer.service;

import br.com.tc.restaurantbuyer.dto.CustomerDTO;
import br.com.tc.restaurantbuyer.entities.Customer;
import br.com.tc.restaurantbuyer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        log.info("");
        Assert.notNull(customerRepository, "CustomerRepository must not be null!");
        this.customerRepository = customerRepository;
    }

    public List<CustomerDTO> listAllCustomers() {
        log.info("Find all customers");
        List<Customer> customerList = customerRepository.findAll();

        return customerList
                .stream()
                .map(this::toCustomerDTO)
                .collect(Collectors.toList());
    }


    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        log.info("Creating Customer {} ", customerDTO.toString());
        try {
            Customer customer = customerRepository.save(toCustomer(customerDTO));
            customerDTO = toCustomerDTO(customer);
        } catch (Exception e) {
            log.error("Error saving new User {}", e.getCause());
            throw e;
        }
        return customerDTO;
    }


    /*----------------------- MAPPERS -----------------------*/
    private CustomerDTO toCustomerDTO(Customer customer) {
        return new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getCnpj(),
                customer.getAuthorizedBudget());
    }

    private Customer toCustomer(CustomerDTO customerDTO) {
        return new Customer(
                customerDTO.name(),
                customerDTO.cnpj(),
                customerDTO.authorizedBudget());
    }


}

