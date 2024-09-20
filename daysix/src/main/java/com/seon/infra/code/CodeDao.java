package com.seon.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
	
	List<CodeDto> selectList();
	
	List<CodeDto> selectListCodeGroup();
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
}
