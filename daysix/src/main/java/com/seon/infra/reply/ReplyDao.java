package com.seon.infra.reply;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ReplyDao {
	
	List<ReplyDto> selectList();

}
