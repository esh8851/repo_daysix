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
	
	public List<BookDto> selectListTicketTime() {
		return bookDao.selectListTicketTime();
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
	
	public List<BookDto> selectListSeatE(BookDto bookDto) {
		return bookDao.selectListSeatE(bookDto);
	}
	
	public List<BookDto> selectListSeatF(BookDto bookDto) {
		return bookDao.selectListSeatF(bookDto);
	}
	
	public List<BookDto> selectListSeatG(BookDto bookDto) {
		return bookDao.selectListSeatG(bookDto);
	}
	
	public List<BookDto> selectListSeatI(BookDto bookDto) {
		return bookDao.selectListSeatI(bookDto);
	}
	
	public List<BookDto> selectListSeatJ(BookDto bookDto) {
		return bookDao.selectListSeatJ(bookDto);
	}
	
	public List<BookDto> selectListSeatK(BookDto bookDto) {
		return bookDao.selectListSeatK(bookDto);
	}
	
	public List<BookDto> selectListSeatL(BookDto bookDto) {
		return bookDao.selectListSeatL(bookDto);
	}
	
}
