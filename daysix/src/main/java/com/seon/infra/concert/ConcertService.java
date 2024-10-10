package com.seon.infra.concert;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {
	
	@Autowired
	ConcertDao concertDao;
	
	public List<ConcertDto> selectList() {
		return concertDao.selectList();
	}
	
	public int insert(ConcertDto concertDto) {
		return concertDao.insert(concertDto);
	}
	
	public ConcertDto selectOne(ConcertDto concertDto) {
		return concertDao.selectOne(concertDto);
	}

}
