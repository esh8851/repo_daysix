package com.seon.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
//	CodeGroupService codeGroupService = new CodeGroupService();
	@Autowired
	CodeGroupService CodeGroupService;
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		
//		여기에서 함수를 호출해야 된다는
//		service에 있는 함수를 호출
		
		List<CodeGroupDto> codeGroups = CodeGroupService.selectService();
		
		System.out.println("codegroups.size() : " + codeGroups.size());
		
		for(CodeGroupDto codeGroupDto: codeGroups) {
			System.out.println(codeGroupDto.getSeq() + " , " + codeGroupDto.getCgName() + " , " + codeGroupDto.getCgUseNy() + " , "+ codeGroupDto.getCgOrder() + " , " + codeGroupDto.getCgDesc() + " , " + codeGroupDto.getDelNy() + " , " + codeGroupDto.getCgDateTime() + " , " + codeGroupDto.getCgDateTimeSvr());
		}
				
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}

}
