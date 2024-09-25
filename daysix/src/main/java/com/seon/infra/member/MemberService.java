package com.seon.infra.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;


@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	
//	selectList
	public List<MemberDto> selectList() {
		return memberDao.selectList();
	}
	
//	insert
	public int insert(MemberDto memberDto) {
		return memberDao.insert(memberDto);
	}
	
//	update - selectOne
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}
	
//	update - update
	public int update(MemberDto memberDto) {
		return memberDao.update(memberDto);
	}
	
	
}
