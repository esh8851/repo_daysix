package com.seon.infra.hoewon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class hoewonService {
	
	@Autowired
	hoewonDao hoewonDao;
	
	public List<hoewonDto> selectService(){
		List<hoewonDto> hoewons = hoewonDao.selectList();
		return hoewons;
	}

}
