package com.seon.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
	@Autowired
	CodeGroupDao codeGroupDao;
	
//	public List<CodeGroupDto> selectService(){
//		List<CodeGroupDto> codeGroups = codeGroupDao.selectList();
//		return codeGroups;
//	}
	
	public List<CodeGroupDto> selectService(){
		return codeGroupDao.selectList();
	}
	
	public int insert(CodeGroupDto codeGroupDto) {
		return codeGroupDao.insert(codeGroupDto);
	}

}
