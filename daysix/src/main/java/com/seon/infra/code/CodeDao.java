package com.seon.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
	
	public List<CodeDto> selectListCachedCodeArrayList();
	
	public int selectOneCount(CodeVo codeVo);
	
	List<CodeDto> selectList(CodeVo codeVo);
	
	List<CodeDto> selectListCodeGroup();
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
	public int update(CodeDto codeDto);
	
	public int uelete(CodeDto codeDto);
	
	public int delete(CodeDto codeDto);
	
}
