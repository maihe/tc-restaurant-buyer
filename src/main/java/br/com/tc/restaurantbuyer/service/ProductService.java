package br.com.tc.restaurantbuyer.service;

import br.com.tc.restaurantbuyer.dto.ProductDTO;
import br.com.tc.restaurantbuyer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
//TODO add logger lib @sl4j
@Service
public class ProductService {
    //@Autowired
    //private ProductRepository productRepository;
    private final ProductRepository productRepository;
    //Construtor para testar sugestao de boas praticas de injecao
    @Autowired
    public ProductService(ProductRepository productRepository) {
        Assert.notNull(productRepository, "ProductRepository must not be null!");
        this.productRepository = productRepository;
    }

    public List<ProductDTO> listAllProductsFromRestaurant(String uuid){
        productRepository.findAllByRestaurantUuid(uuid);
        //construir mapper
        return new ArrayList<ProductDTO>();
    }
}
