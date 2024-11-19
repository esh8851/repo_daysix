package com.seon.infra.indexUsr;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IndexUsrDao {
	
	public List<IndexUsrDto> selectList(IndexUsrDto indexUsrDto);
	
}
