package com.seon.infra.book;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
	
	public List<BookDto> selectList(BookDto bookDto);
	
	public List<BookDto> selectListTicket();
	
	public List<BookDto> selectListSeatA(BookDto bookDto);
	
	public List<BookDto> selectListSeatB(BookDto bookDto);
	
	public List<BookDto> selectListSeatC(BookDto bookDto);
	
	public List<BookDto> selectListSeatD(BookDto bookDto);
	
}
