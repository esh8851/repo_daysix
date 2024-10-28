package com.seon.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seon.common.util.UtilDateTime;
import com.seon.infra.mail.MailService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	MailService mailService;
	
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
	
//	memberXdmInstUsr
	@RequestMapping(value="/v1/infra/member/memberXdmInstUsr")
	public String memberXdmInstUsr(MemberDto memberDto) {
		memberService.insertUsr(memberDto);
		return "redirect:/v1/infra/login/loginUsrSignIn";
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
	
	@ResponseBody
	@RequestMapping(value = "/v1/infra/member/signinXdmProc")
	public Map<String, Object> signinXdmProc(MemberDto memberDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
//		MemberDto rtMember = memberService.selectOneId(memberDto);

		MemberDto rtMember2 = memberService.selectOneLogin(memberDto);

			if (rtMember2 != null) {
				
//				if(dto.getAutoLogin() == true) {
//					UtilCookie.createCookie(
//							Constants.COOKIE_SEQ_NAME_XDM, 
//							rtMember2.getIfmmSeq(), 
//							Constants.COOKIE_DOMAIN_XDM, 
//							Constants.COOKIE_PATH_XDM, 
//							Constants.COOKIE_MAXAGE_XDM);
//				} else {
//					// by pass
//				}

				httpSession.setMaxInactiveInterval(60 * 30); // 60second * 30 = 30minute
				httpSession.setAttribute("sessSeqXdm", rtMember2.getMmSeq());
				httpSession.setAttribute("sessIdXdm", rtMember2.getMmId());
				httpSession.setAttribute("sessNameXdm", rtMember2.getMmName());
				
				System.out.println("sessSeqXdm: " + httpSession.getAttribute("sessSeqXdm"));
				System.out.println("sessIdXdm: " + httpSession.getAttribute("sessIdXdm"));
				System.out.println("sessNameXdm: " + httpSession.getAttribute("sessNameXdm"));
				
//				rtMember2.setIfmmSocialLoginCd(103);
//				rtMember2.setIflgResultNy(1);
//				memberService.insertLogLogin(rtMember2);
				
//				이메일
//				mailService.sendMailSimple(); //시간이 오래걸리니까 Thread를 쓴다
				
				Thread thread = new Thread(new Runnable() {
					@Override
					public void run() {
						mailService.sendMailSimple();
					}
				});
				
				thread.start();

				returnMap.put("rt", "success");
			} else {
//				memberDto.setIfmmSocialLoginCd(103);
//				memberDto.setIfmmSeq(rtMember.getIfmmSeq());
//				memberDto.setIflgResultNy(0);
//				memberService.insertLogLogin(memberDto);
				returnMap.put("rt", "fail");
			}
//			memberDto.setIfmmSocialLoginCd(103);
//			memberDto.setIflgResultNy(0);
//			memberService.insertLogLogin(memberDto);
			
		return returnMap;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/v1/infra/member/signoutXdmProc")
	public Map<String, Object> signoutXdmProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}
	
	
}
