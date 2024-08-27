package com.seon.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value="/v1/infra/code/codeXdmList")
	public String codeXdmList() {
		List<CodeDto> codeGroups = codeService.selectList();
		
		System.out.println("codeGroups.size() : " + codeGroups.size());
		
		for(CodeDto codeGroup: codeGroups) {
			System.out.println(codeGroup.getSeq() + " | " + codeGroup.getcName() + " | " + codeGroup.getcUseNy() + " | " + codeGroup.getcOrder() + " | " + codeGroup.getDelNy() + " | " + codeGroup.getcDateTime() + " | " + codeGroup.getcDateTimeSvr() + " | " + codeGroup.getCodeGroup_seq());
		}
		
		return "xdm/v1/infra/code/codeXdmList";
	}

}
