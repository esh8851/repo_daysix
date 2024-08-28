package com.seon.infra.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping(value="/v1/infra/restaurant/restaurantUsr")
	public String restaurantUsr() {
		List<RestaurantDto> restaurants = restaurantService.selectService();
		System.out.println(restaurants.size());
		for(RestaurantDto restauranti: restaurants) {
			System.out.println(restauranti.getSeq() + "|" + restauranti.getRestaurantType() + "|" + restauranti.getRestaurantName() + "|" + restauranti.getRestaurantOpenTime() + "|" + restauranti.getRestaurantCloseTime() + "|" + restauranti.getRestaurantPhone() + "|" + restauranti.getRestaurantHomePage() + "|" + restauranti.getRestaurantParkingNy() + "|" + restauranti.getRestaurantRegNy() + "|" + restauranti.getRestaurantCorkageNy() + "|" + restauranti.getRestaurantIntroText() + "|" + restauranti.getRestaurantRegDateTime() + "|" + restauranti.getRestaurantModDateTime());
		}
		return "/usr/v1/infra/restaurant/restaurantUsr";
	}

}
