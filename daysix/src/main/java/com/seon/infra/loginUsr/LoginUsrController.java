package com.seon.infra.loginUsr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginUsrController {
	
	@Autowired
	LoginUsrService loginUsrService;
	
	@RequestMapping(value="/v1/infra/login/loginUsrSignIn")
	public String loginUsrSignIn(Model model) {
		model.addAttribute("list", loginUsrService.selectList());
		return "/usr/v1/infra/login/loginUsrSignIn";
	}
	
	@ResponseBody
	@RequestMapping(value = "/v1/infra/loginUsr/signinUsrProc")
	public Map<String, Object> signinUsrProc(LoginUsrDto loginUsrDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
//		MemberDto rtMember = memberService.selectOneId(memberDto);

		LoginUsrDto rtMember2 = loginUsrService.selectOneLogin(loginUsrDto);

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
	
}
