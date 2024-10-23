package com.seon.infra.concertHall;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ConcertHallDao {
	
public List<ConcertHallDto> selectList(ConcertHallVo concertHallVo);
	
	public int insert(ConcertHallDto concertHallDto);
	
	public int uelete(ConcertHallDto concertHallDto);
	
	public int delete(ConcertHallDto concertHallDto);
	
	public ConcertHallDto selectOne(ConcertHallDto concertHallDto);
	
	public int update(ConcertHallDto concertHallDto);
	
	public int selectOneCount(ConcertHallVo concertHallVo);

}
