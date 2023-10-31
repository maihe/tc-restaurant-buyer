package br.com.tc.restaurantbuyer.dto;

public record ProductDTO(
        String name,
        String units,
        Integer maxQuantity,
        Integer minQuantity,
        String category,
        String obs) {
}
