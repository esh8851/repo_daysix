package com.seon.infra.indexUsr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexUsrController {
	
	@RequestMapping(value="/v1/infra/index/indexUsrView")
	public String indexUsrView() {
		return "/usr/v1/infra/index/indexUsrView";
	}

}
