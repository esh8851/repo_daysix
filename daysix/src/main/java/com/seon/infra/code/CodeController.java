package com.seon.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seon.common.util.UtilDateTime;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value="/v1/infra/code/codeXdmList")
	public String codeXdmSignUp(@ModelAttribute("vo") CodeVo codeVo, Model model) {
//		List<CodeDto> codeGroup = codeService.selectService();
//		System.out.println(codeGroup.size());
//		for(CodeDto groups: codeGroup) {
//			System.out.println(groups.getSeq() + "|" + groups.getcName() + "|" + groups.getcUseNy() + "|" + groups.getcOrder() + "|" + groups.getDelNy() + "|" + groups.getcDateTime() + "|" + groups.getcDateTimeSvr() + "|" + groups.getCodeGroup_seq());
//		}
//		model.addAttribute("list", codeService.selectService(codeVo));
		
//		날짜 필드에 시간 추가
//		  codeVo.setShDateStart(codeVo.getShDateStart()+" 00:00:00");
//		  codeVo.setShDateEnd(codeVo.getShDateEnd()+" 23:59:59");
		  
	  /* 초기값 세팅이 없는 경우 사용 */
		  codeVo.setShDateStart(codeVo.getShDateStart() == null || codeVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codeVo.getShDateStart()));
		  codeVo.setShDateEnd(codeVo.getShDateEnd() == null || codeVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codeVo.getShDateEnd()));
		 
		
//		paging
		codeVo.setParamsPaging(codeService.selectOneCount(codeVo));
		if(codeVo.getTotalRows() > 0) {
			model.addAttribute("list", codeService.selectService(codeVo));
		}
		
		return "/xdm/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
//		List<CodeDto> codeGroups = codeService.selectListCodeGroup();
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
//		List<CodeDto> codeGroups = codeService.selectListCodeGroup();
		model.addAttribute("listCodeGroup", codeService.selectListCodeGroup());
		return "/xdm/v1/infra/code/codeXdmMForm";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto) {
		codeService.update(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmUel")
	public String codeXdmUel(CodeDto codeDto) {
		codeService.uelete(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value="/v1/infra/code/codeXdmDel")
	public String codeXdmDel(CodeDto codeDto) {
		codeService.delete(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
}
