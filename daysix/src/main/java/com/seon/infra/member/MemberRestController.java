package com.seon.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/member")
public class MemberRestController {
	
	@Autowired
	MemberService memberService;
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping("")
	public List<MemberDto> selectList(MemberVo memberVo) throws Exception {
		List<MemberDto> list = memberService.selectList(memberVo);
		System.out.println(list+"@@@@@@@@@@@@@");
		return list;
	}
	
	@GetMapping("/{mmSeq}")
	public MemberDto selectOne(MemberDto memberDto) throws Exception {
		MemberDto item = memberService.selectOne(memberDto);
		return item;
	}

}
