package com.seon.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value="/v1/infra/code/codeXdmSignUp")
	public String codeXdmSignUp() {
		List<CodeDto> codeGroup = codeService.selectService();
		System.out.println(codeGroup.size());
		for(CodeDto groups: codeGroup) {
			System.out.println(groups.getSeq() + "|" + groups.getcName() + "|" + groups.getcUseNy() + "|" + groups.getcOrder() + "|" + groups.getDelNy() + "|" + groups.getcDateTime() + "|" + groups.getcDateTimeSvr() + "|" + groups.getCodeGroup_seq());
		}
		return "/xdm/v1/infra/code/codeXdmSignUp";
	}

}
