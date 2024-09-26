package com.seon.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
//	selectList
	List<MemberDto> selectList(MemberVo memberVo);
	
//	insert
	public int insert(MemberDto memberDto);
	
//	update - selectOne
	public MemberDto selectOne(MemberDto memberDto);
	
//	update - update
	public int update(MemberDto memberDto);
	
//	uelete
	public int uelete(MemberDto memberDto);
	
//	delete
	public int delete(MemberDto memberDto);
	
//	paging
	public int selectOneCount(MemberVo memberVo);
	
}
