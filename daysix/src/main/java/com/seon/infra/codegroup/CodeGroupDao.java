package com.seon.infra.codegroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	
	public int selectOneCount(CodeGroupVo codeGroupVo);
	
	public List<CodeGroupDto> selectList(CodeGroupVo codeGroupVo);
	
	public int insert(CodeGroupDto codeGroupDto);
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto);
	
	public int update(CodeGroupDto codeGroupDto);
	
	// uelete
	public int uelete(CodeGroupDto codeGroupDto);
	
	// delete
	public int delete(CodeGroupDto codeGroupDto);

}
