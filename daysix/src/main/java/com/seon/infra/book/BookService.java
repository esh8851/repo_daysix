package com.seon.infra.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookDao bookDao;
	
	public List<BookDto> selectList(BookDto bookDto) {
		return bookDao.selectList(bookDto);
	}
	
	public List<BookDto> selectListTicket() {
		return bookDao.selectListTicket();
	}
	
	public List<BookDto> selectListSeatA(BookDto bookDto) {
		return bookDao.selectListSeatA(bookDto);
	}
	
	public List<BookDto> selectListSeatB(BookDto bookDto) {
		return bookDao.selectListSeatB(bookDto);
	}
	
	public List<BookDto> selectListSeatC(BookDto bookDto) {
		return bookDao.selectListSeatC(bookDto);
	}
	
	public List<BookDto> selectListSeatD(BookDto bookDto) {
		return bookDao.selectListSeatD(bookDto);
	}
	
}
