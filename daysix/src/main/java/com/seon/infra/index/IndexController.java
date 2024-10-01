package com.seon.infra.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Autowired
	IndexService indexService;
	
	@RequestMapping(value="/v1/infra/index/indexXdmView")
	public String indexXdmView() {
		return "/xdm/v1/infra/index/indexXdmView";
	}

}
