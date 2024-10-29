package com.seon.infra.signUpUsr;

import org.springframework.stereotype.Repository;

@Repository
public interface SignUpUsrDao {
	
	public int insert(SignUpUsrDto signUpUsrDto);

}
