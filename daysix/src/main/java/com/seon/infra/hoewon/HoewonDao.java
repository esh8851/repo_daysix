package com.seon.infra.hoewon;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface HoewonDao {
	
	List<HoewonDto> selectList();
	
	public int insert(HoewonDto hoewonDto);

}
