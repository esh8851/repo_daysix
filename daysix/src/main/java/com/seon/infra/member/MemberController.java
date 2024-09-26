package com.seon.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seon.common.util.UtilDateTime;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
//	memberXdmList
	@RequestMapping(value="/v1/infra/member/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo memberVo, Model model) {
//		날짜 필드에 시간 추가
//		memberVo.setShDateStart(memberVo.getShDateStart()+" 00:00:00");			
//		memberVo.setShDateEnd(memberVo.getShDateEnd()+" 23:59:59");
		
		// 초기값 세팅이 없는 경우 사용
		memberVo.setShDateStart(memberVo.getShDateStart() == null || memberVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(memberVo.getShDateStart()));
		memberVo.setShDateEnd(memberVo.getShDateEnd() == null || memberVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(memberVo.getShDateEnd()));
		
//		paging
		memberVo.setParamsPaging(memberService.selectOneCount(memberVo));
		if(memberVo.getTotalRows() > 0) {
			model.addAttribute("list", memberService.selectList(memberVo));
		}
		
//		model.addAttribute("list", memberService.selectList(memberVo));
		return "/xdm/v1/infra/member/memberXdmList";
	}
	
//	memberXdmForm
	@RequestMapping(value="/v1/infra/member/memberXdmForm")
	public String memberXdmForm() {
		return "/xdm/v1/infra/member/memberXdmForm";
	}
	
//	memberXdmInst
	@RequestMapping(value="/v1/infra/member/memberXdmInst")
	public String memberXdmInst(MemberDto memberDto) {
		memberService.insert(memberDto);
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
//	memberXdmMForm
//	update - selectOne
	@RequestMapping(value="/v1/infra/member/memberXdmMForm")
	public String memberXdmMForm(MemberDto memberDto, Model model) {
		model.addAttribute("item", memberService.selectOne(memberDto));
		return "xdm/v1/infra/member/memberXdmMForm";
	}
	
//	update - update
	@RequestMapping(value="/v1/infra/member/memberXdmUpdt")
	public String memberXdmUpdt(MemberDto memberDto) {
		memberService.update(memberDto);
		System.out.println("update");
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
//	uelete
	@RequestMapping(value="/v1/infra/member/memberXdmUel")
	public String memberXdmUel(MemberDto memberDto) {
		memberService.uelete(memberDto);
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
//	delete
	@RequestMapping(value="/v1/infra/member/memberXdmDel")
	public String memberXdmDel(MemberDto memberDto) {
		memberService.delete(memberDto);
		return "redirect:/v1/infra/member/memberXdmList";
	}
	

}
