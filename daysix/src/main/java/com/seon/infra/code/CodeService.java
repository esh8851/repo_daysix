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
	
	public List<CodeDto> selectListCodeGroup(){
		return codeDao.selectListCodeGroup();
	}
	
	public int insert(CodeDto codeDto) {
		return codeDao.insert(codeDto);
	}
	
	public CodeDto selectOne(CodeDto codeDto) {
		return codeDao.selectOne(codeDto);
	}
	
	public int update(CodeDto codeDto) {
		return codeDao.update(codeDto);
	}
	
	public int uelete(CodeDto codeDto) {
		return codeDao.uelete(codeDto);
	}
	
	public int delete(CodeDto codeDto) {
		return codeDao.delete(codeDto);
	}
	
}
