package br.com.tc.restaurantbuyer.dto;


public record UserDTO(
        Long id,
        String login,
        String role,
        String customer) {
}
