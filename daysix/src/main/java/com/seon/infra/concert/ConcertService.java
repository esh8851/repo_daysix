package com.seon.infra.concert;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {
	
	@Autowired
	ConcertDao concertDao;
	
	public List<ConcertDto> selectList(ConcertVo concertVo) {
		return concertDao.selectList(concertVo);
	}
	
	public int insert(ConcertDto concertDto) {
		return concertDao.insert(concertDto);
	}
	
	public int update(ConcertDto concertDto) {
		return concertDao.update(concertDto);
	}
	
	public int uelete(ConcertDto concertDto) {
		return concertDao.uelete(concertDto);
	}
	
	public int delete(ConcertDto concertDto) {
		return concertDao.delete(concertDto);
	}
	
	public ConcertDto selectOne(ConcertDto concertDto) {
		return concertDao.selectOne(concertDto);
	}
	
	public int selectOneCount(ConcertVo concertVo) {
		return concertDao.selectOneCount(concertVo);
	}
	
//	reply
	public int selectOneCountReply(ConcertDto concertDto) {
		return concertDao.selectOneCountReply(concertDto);
	}
	
	public List<ConcertDto> selectListReply(ConcertDto concertDto) {
		return concertDao.selectListReply(concertDto);
	}
	
//	hall
	
}
