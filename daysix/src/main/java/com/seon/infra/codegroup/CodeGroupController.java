package com.seon.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
//	CodeGroupService codeGroupService = new CodeGroupService();
	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		
//		여기에서 함수를 호출해야 된다는
//		service에 있는 함수를 호출
		
		service.selectService();
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}

}
