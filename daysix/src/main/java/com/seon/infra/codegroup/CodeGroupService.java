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
	
//	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
//		 CodeGroupDto dto = codeGroupDao.selectOne(codeGroupDto);
//		 return dto;
//	}
	
//	축약
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}
	
//	public int update(CodeGroupDto codeGroupDto) {
//		int a = codeGroupDao.update(codeGroupDto); 
//		return a;
//	}
	
//	축약
	public int update(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getSeq());
		return codeGroupDao.update(codeGroupDto);
	}

}
