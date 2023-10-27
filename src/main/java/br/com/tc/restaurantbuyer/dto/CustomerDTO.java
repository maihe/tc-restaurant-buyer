package br.com.tc.restaurantbuyer.dto;

public class CustomerDTO(
    private Long customerId,
    private String cnpj,
    private BigDecimal authorizedBudget,
    private String address,
    private String name,
    private String email) {}