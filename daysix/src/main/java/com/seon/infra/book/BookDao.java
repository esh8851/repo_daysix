package com.seon.infra.book;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
	
	public List<BookDto> selectList(BookDto bookDto);
	
	public List<BookDto> selectListTicket();
	
	public List<BookDto> selectListTicketTime();
	
	public List<BookDto> selectListSeatA(BookDto bookDto);
	
	public List<BookDto> selectListSeatB(BookDto bookDto);
	
	public List<BookDto> selectListSeatC(BookDto bookDto);
	
	public List<BookDto> selectListSeatD(BookDto bookDto);
	
	public List<BookDto> selectListSeatE(BookDto bookDto);
	
	public List<BookDto> selectListSeatF(BookDto bookDto);
	
	public List<BookDto> selectListSeatG(BookDto bookDto);
	
	public List<BookDto> selectListSeatI(BookDto bookDto);
	
	public List<BookDto> selectListSeatJ(BookDto bookDto);
	
	public List<BookDto> selectListSeatK(BookDto bookDto);
	
	public List<BookDto> selectListSeatL(BookDto bookDto);
	
}
