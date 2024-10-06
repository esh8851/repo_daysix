package com.seon.infra.loginUsr;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginUsrDao {
	
	List<LoginUsrDto> selectList();
	
	public LoginUsrDto selectOneLogin(LoginUsrDto loginUsrDto);
	
}
