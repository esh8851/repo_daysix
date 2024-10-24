package com.seon.infra.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {
	
	@Autowired
	ReplyDao replyDao;
	
	public List<ReplyDto> selectList() {
		return replyDao.selectList();
	}

}
