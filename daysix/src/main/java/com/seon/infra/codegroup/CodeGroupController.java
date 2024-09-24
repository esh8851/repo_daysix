package com.seon.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seon.common.util.UtilDateTime;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo codeGroupVo, Model model) {
		
//		paging
		codeGroupVo.setParamsPaging(codeGroupService.selectOneCount(codeGroupVo));
		if (codeGroupVo.getTotalRows() > 0) {
			model.addAttribute("list", codeGroupService.selectService(codeGroupVo));
		}
		
//		날짜 필드에 시간 추가
//		codeGroupVo.setShDateStart(codeGroupVo.getShDateStart()+" 00:00:00");
//		codeGroupVo.setShDateEnd(codeGroupVo.getShDateEnd()+" 23:59:59");
		
		/* 초기값 세팅이 없는 경우 사용 */
		codeGroupVo.setShDateStart(codeGroupVo.getShDateStart() == null || codeGroupVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codeGroupVo.getShDateStart()));
		codeGroupVo.setShDateEnd(codeGroupVo.getShDateEnd() == null || codeGroupVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codeGroupVo.getShDateEnd()));
		
//		자바객체를 html으로 전달할 때는 Model객체 사용
//		codeGroups 자바 객체를 "list" 라는 이름의 변수명으로 html에 전달
//		List<CodeGroupDto> codeGroups = codeGroupService.selectService();
//		model.addAttribute("list", codeGroups);
		
//		자바에서 더 코딩을 하지않고 값만 넘겨줄 때 codeGroupService.selectService() 사용
		model.addAttribute("list", codeGroupService.selectService(codeGroupVo));
		
//		System.out.println(codeGroups.size());
//		
//		for(CodeGroupDto groups: codeGroups) {
//			System.out.println(groups.getCgSeq() + "|" + groups.getCgName() + "|" + groups.getCgUseNy() + "|" + groups.getCgOrder() + "|" + groups.getCgDesc() + "|" + groups.getDelNy() + "|" + groups.getCgDateTime() + "|" + groups.getCgDateTimeSvr());
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
	
//	uelete
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmUel")
	public String codeGroupXdmUel(CodeGroupDto codeGroupDto) {
		codeGroupService.uelete(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
//	delete
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmDel")
	public String codeGroupXdmDel(CodeGroupDto codeGroupDto) {
		codeGroupService.delete(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}

}
