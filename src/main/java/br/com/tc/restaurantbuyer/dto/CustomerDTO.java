package br.com.tc.restaurantbuyer.dto;

import java.math.BigDecimal;

public record CustomerDTO(
        Long id,
        String name,
        String cnpj,
        BigDecimal authorizedBudget
) {
}
