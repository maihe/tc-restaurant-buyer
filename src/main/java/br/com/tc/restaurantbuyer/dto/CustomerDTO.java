package br.com.tc.restaurantbuyer.dto;

import java.math.BigDecimal;

public record CustomerDTO(
        Long customerId,
        String cnpj,
        BigDecimal authorizedBudget,
        String address,
        String name,
        String email) {
}