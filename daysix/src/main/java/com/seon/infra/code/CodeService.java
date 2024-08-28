package com.seon.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
	
	@Autowired
	CodeDao codeDao;
	
	public List<CodeDto> selectService(){
		List<CodeDto> codeGroup = codeDao.selectList();
		return codeGroup;
	}

}
