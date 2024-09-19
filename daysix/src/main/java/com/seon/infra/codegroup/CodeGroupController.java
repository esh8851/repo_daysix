package com.seon.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(Model model) {
		
		
//		자바객체를 html으로 전달할 때는 Model객체 사용
//		codeGroups 자바 객체를 "list" 라는 이름의 변수명으로 html에 전달
//		List<CodeGroupDto> codeGroups = codeGroupService.selectService();
//		model.addAttribute("list", codeGroups);
		
//		자바에서 더 코딩을 하지않고 값만 넘겨줄 때 codeGroupService.selectService() 사용
		model.addAttribute("list", codeGroupService.selectService());
		
//		System.out.println(codeGroups.size());
//		
//		for(CodeGroupDto groups: codeGroups) {
//			System.out.println(groups.getSeq() + "|" + groups.getCgName() + "|" + groups.getCgUseNy() + "|" + groups.getCgOrder() + "|" + groups.getCgDesc() + "|" + groups.getDelNy() + "|" + groups.getCgDateTime() + "|" + groups.getCgDateTimeSvr());
//		}
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) {
		System.out.println("codeGroupDto.getCgName() : " + codeGroupDto.getCgName());
		codeGroupService.insert(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
//	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmMForm")
//	public String codeGroupXdmMForm(CodeGroupDto codeGroupDto, Model model) {
//		CodeGroupDto dto = codeGroupService.selectOne(codeGroupDto);
//		model.addAttribute("item", dto);
//		return "/xdm/v1/infra/codegroup/codeGroupXdmMForm";
//	}
	
//	축약
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmMForm")
	public String codeGroupXdmMForm(CodeGroupDto codeGroupDto, Model model) {
		model.addAttribute("item", codeGroupService.selectOne(codeGroupDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/codegroup/codeGroupXdmMForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/codegroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {
		codeGroupService.update(codeGroupDto);
		System.out.println("update 실행했다~");
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}

}
