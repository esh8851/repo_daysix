package com.seon.infra.concert;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ConcertDao {
	
	public List<ConcertDto> selectList(ConcertVo concertVo);
	
	public int insert(ConcertDto concertDto);
	
	public int uelete(ConcertDto concertDto);
	
	public int delete(ConcertDto concertDto);
	
	public ConcertDto selectOne(ConcertDto concertDto);
	
	public int update(ConcertDto concertDto);
	
	public int selectOneCount(ConcertVo concertVo);
	
//	reply
	public int selectOneCountReply(ConcertDto concertDto);
	
	public List<ConcertDto> selectListReply(ConcertDto concertDto);
	
	public int insertReply(ConcertDto concertDto);
	
//	file
	public int insertUploaded(ConcertDto concertDto);
	
//	score
	public int insertScore(ConcertDto concertDto);
	
	public Double selectOneAvg(ConcertDto concertDto);
	
//	img
	public ConcertDto selectOneImg(ConcertDto concertDto);
	
	
}
