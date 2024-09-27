package com.seon.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/v1/infra/product/productXdmList")
	public String productXdmList(Model model) {
		model.addAttribute("list", productService.selectList());
		return "/xdm/v1/infra/product/productXdmList";
	}
	
	@RequestMapping(value="/v1/infra/product/productXdmForm")
	public String productXdmForm() {
		return "/xdm/v1/infra/product/productXdmForm";
	}

}
