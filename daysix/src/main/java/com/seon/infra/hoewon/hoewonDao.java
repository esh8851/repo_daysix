package com.seon.infra.hoewon;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface hoewonDao {
	
	List<hoewonDto> selectList();

}
