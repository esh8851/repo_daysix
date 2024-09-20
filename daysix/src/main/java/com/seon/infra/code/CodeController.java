package com.seon.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value="/v1/infra/code/codeXdmList")
	public String codeXdmSignUp(Model model) {
//		List<CodeDto> codeGroup = codeService.selectService();
//		System.out.println(codeGroup.size());
//		for(CodeDto groups: codeGroup) {
//			System.out.println(groups.getSeq() + "|" + groups.getcName() + "|" + groups.getcUseNy() + "|" + groups.getcOrder() + "|" + groups.getDelNy() + "|" + groups.getcDateTime() + "|" + groups.getcDateTimeSvr() + "|" + groups.getCodeGroup_seq());
//		}
		model.addAttribute("list", codeService.selectService());
		return "/xdm/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
		List<CodeDto> codeGroups = codeService.selectListCodeGroup();
		model.addAttribute("listCodeGroup", codeService.selectListCodeGroup());
		return "/xdm/v1/infra/code/codeXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		codeService.insert(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmMForm")
	public String codeXdmMForm(CodeDto codeDto, Model model) {
		model.addAttribute("item", codeService.selectOne(codeDto));
		List<CodeDto> codeGroups = codeService.selectListCodeGroup();
		model.addAttribute("listCodeGroup", codeService.selectListCodeGroup());
		return "/xdm/v1/infra/code/codeXdmMForm";
	}
	
}
