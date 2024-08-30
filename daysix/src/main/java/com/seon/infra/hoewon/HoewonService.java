package com.seon.infra.hoewon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoewonService {
	
	@Autowired
	HoewonDao hoewonDao;
	
	public List<HoewonDto> selectService(){
		List<HoewonDto> hoewons = hoewonDao.selectList();
		return hoewons;
	}
	
	public int insert(HoewonDto hoewonDto) {
		return hoewonDao.insert(hoewonDto);
	}

}
