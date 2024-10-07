package com.seon.infra.signUpUsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpUsrService {
	
	@Autowired
	SignUpUsrDao signUpUsrDao;

}
