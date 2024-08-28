package com.seon.infra.restaurant;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantDao {
	
	List<RestaurantDto> selectList();

}
