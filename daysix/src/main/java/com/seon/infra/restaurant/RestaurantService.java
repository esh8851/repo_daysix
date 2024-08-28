package com.seon.infra.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantDao restaurantDao;
	
	public List<RestaurantDto> selectService(){
		List<RestaurantDto> restaurants = restaurantDao.selectList();
		return restaurants;
	}

}
