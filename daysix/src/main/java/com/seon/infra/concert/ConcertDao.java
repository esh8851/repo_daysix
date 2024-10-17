package com.seon.infra.concert;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ConcertDao {
	
	public List<ConcertDto> selectList(ConcertVo concertVo);
	
	public int insert(ConcertDto concertDto);
	
	public int insertHall(ConcertDto concertDto);
	
	public int uelete(ConcertDto concertDto);
	
	public int delete(ConcertDto concertDto);
	
	public ConcertDto selectOne(ConcertDto concertDto);
	
	public int update(ConcertDto concertDto);
	
	public int selectOneCount(ConcertVo concertVo);

}