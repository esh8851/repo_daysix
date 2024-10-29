package com.seon.infra.signUpUsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpUsrController {
	
	@Autowired
	SignUpUsrService signUpUsrService;
	
	@RequestMapping(value="/v1/infra/login/loginUsrSignUp")
	public String loginUsrSignUp() {
		return "/usr/v1/infra/login/loginUsrSignUp";
	}
	
}
