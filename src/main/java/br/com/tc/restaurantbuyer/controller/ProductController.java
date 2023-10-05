package br.com.tc.restaurantbuyer.controller;

import br.com.tc.restaurantbuyer.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products/{restaurantUuid}")
public class ProductController {

    @GetMapping
    public List<ProductDTO> listAllProducts(){
        List<ProductDTO> exampleProducts = new ArrayList<>();
        ProductDTO  productDTO1 = new ProductDTO("Macarrao Barilla", "pct", 10,2,
                "mantinmentos", "Substituir por Adria");
        exampleProducts.add(productDTO1);
        return exampleProducts;
    }
}
