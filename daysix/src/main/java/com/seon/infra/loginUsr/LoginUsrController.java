package com.seon.infra.loginUsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginUsrController {
	
	@Autowired
	LoginUsrService loginUsrService;
	
	@RequestMapping(value="/v1/infra/login/loginUsrSignIn")
	public String loginUsrSignIn() {
		return "/usr/v1/infra/login/loginUsrSignIn";
	}
	
}
