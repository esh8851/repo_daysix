package com.seon.infra.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/v1/infra/login/loginXdmSignIn")
	public String longinXdmSignIn() {
		return "/xdm/v1/infra/login/loginXdmSignIn";
	}

}
