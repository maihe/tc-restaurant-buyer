package br.com.tc.restaurantbuyer.dto;
//tem que recuperar o nome da category antes do dto para o produto
public record ProductDTO( String name,
                          String description,
                          String units,
                          String category) {}
