package com.seon.infra.loginUsr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUsrService {
	
	@Autowired
	LoginUsrDao loginUsrDao;
	
	List<LoginUsrDto> selectList() {
		return loginUsrDao.selectList();
	}
	
	public LoginUsrDto selectOneLogin(LoginUsrDto loginUsrDto) {
		return loginUsrDao.selectOneLogin(loginUsrDto);
	}
	
}
