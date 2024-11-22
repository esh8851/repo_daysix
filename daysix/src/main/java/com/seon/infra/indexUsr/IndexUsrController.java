package com.seon.infra.indexUsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexUsrController {
	
	@Autowired
	IndexUsrService indexUsrService;
	
	@RequestMapping(value="/v1/infra/index/indexUsrView")
	public String indexUsrView(Model model, IndexUsrDto indexUsrDto) {
		model.addAttribute("list", indexUsrService.selectList(indexUsrDto));
		return "usr/v1/infra/index/indexUsrView";
	}
	
}
