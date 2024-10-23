package com.seon.infra.concertHall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertHallService {
	
	@Autowired
	ConcertHallDao concertHallDao;
	
	public List<ConcertHallDto> selectList(ConcertHallVo concertHallVo) {
		return concertHallDao.selectList(concertHallVo);
	}
	
	public int insert(ConcertHallDto concertHallDto) {
		return concertHallDao.insert(concertHallDto);
	}
	
	public int update(ConcertHallDto concertHallDto) {
		return concertHallDao.update(concertHallDto);
	}
	
	public int uelete(ConcertHallDto concertHallDto) {
		return concertHallDao.uelete(concertHallDto);
	}
	
	public int delete(ConcertHallDto concertHallDto) {
		return concertHallDao.delete(concertHallDto);
	}
	
	public ConcertHallDto selectOne(ConcertHallDto concertHallDto) {
		return concertHallDao.selectOne(concertHallDto);
	}
	
	public int selectOneCount(ConcertHallVo concertHallVo) {
		return concertHallDao.selectOneCount(concertHallVo);
	}

}
