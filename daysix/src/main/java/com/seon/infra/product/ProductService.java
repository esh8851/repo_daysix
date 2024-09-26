package com.seon.infra.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public List<ProductDto> selectList() {
		return productDao.selectList();	
	}

}
