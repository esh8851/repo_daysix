package com.seon.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
//	CodeGroupDao codeGroupDao = new CodeGroupDao();
	@Autowired
	CodeGroupDao dao;
	
	public void selectService() {
//		codeGroupDao.selectList();
		dao.selectList();
		
	}

}
