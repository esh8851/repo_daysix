package com.seon.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
//	memberXdmList
	@RequestMapping(value="/v1/infra/member/memberXdmList")
	public String memberXdmList(Model model) {
		model.addAttribute("list", memberService.selectList());
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
	

}
