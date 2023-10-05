package br.com.tc.restaurantbuyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RestaurantBuyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantBuyerApplication.class, args);
		System.out.println(" ***** Hello Time FIAP *****");
	}

}
