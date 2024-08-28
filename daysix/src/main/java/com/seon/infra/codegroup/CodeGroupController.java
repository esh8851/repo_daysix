package com.seon.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		List<CodeGroupDto> codeGroups = codeGroupService.selectService();
		
		System.out.println(codeGroups.size());
		
		for(CodeGroupDto groups: codeGroups) {
			System.out.println(groups.getSeq() + "|" + groups.getCgName() + "|" + groups.getCgUseNy() + "|" + groups.getCgOrder() + "|" + groups.getCgDesc() + "|" + groups.getDelNy() + "|" + groups.getCgDateTime() + "|" + groups.getCgDateTimeSvr());
		}
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}

}
