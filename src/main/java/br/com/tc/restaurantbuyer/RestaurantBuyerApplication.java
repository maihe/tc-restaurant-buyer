package br.com.tc.restaurantbuyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantBuyerApplication {
	//PurchasingFacilitatorApplication

	public static void main(String[] args) {
		SpringApplication.run(RestaurantBuyerApplication.class, args);
		System.out.println(" ***** Hello Time FIAP *****");
		//TODO create default user as admin
	}

}
