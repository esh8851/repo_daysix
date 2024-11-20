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

}
