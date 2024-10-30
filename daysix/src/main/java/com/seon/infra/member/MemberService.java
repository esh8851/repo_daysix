package com.seon.infra.member;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	
//	selectList
	public List<MemberDto> selectList(MemberVo memberVo) {
		return memberDao.selectList(memberVo);
	}
	
//	insert
	public int insert(MemberDto memberDto) {
		return memberDao.insert(memberDto);
	}
	
//	insert
	public int insertUsr(MemberDto memberDto) {
		return memberDao.insertUsr(memberDto);
	}
	
//	update - selectOne
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}
	
//	update - update
	public int update(MemberDto memberDto) {
		return memberDao.update(memberDto);
	}
	
//	uelete
	public int uelete(MemberDto memberDto) {
		return memberDao.uelete(memberDto);
	}
	
//	delete
	public int delete(MemberDto memberDto) {
		return memberDao.delete(memberDto);
	}
	
//	paging
	public int selectOneCount(MemberVo memberVo) {
		return memberDao.selectOneCount(memberVo);
	}
	
//	selectOneLogin
	public MemberDto selectOneLogin(MemberDto memberDto) {
		return memberDao.selectOneLogin(memberDto);
	}
	
//	selectOneId
	public MemberDto selectOneId(MemberDto memberDto) {
		return memberDao.selectOneId(memberDto);
	}
	
	
}
