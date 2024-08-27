package com.seon.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
//	CodeGroupDao codeGroupDao = new CodeGroupDao();
	@Autowired
	CodeGroupDao codeGroupDao;
	
	public List<CodeGroupDto> selectService() {
//		codeGroupDao.selectList();
		List<CodeGroupDto> codeGroups = codeGroupDao.selectList();
		return codeGroups;
	}

}
