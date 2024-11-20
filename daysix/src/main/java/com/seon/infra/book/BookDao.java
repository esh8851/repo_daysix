package com.seon.infra.book;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
	
	public List<BookDto> selectList(BookDto bookDto);

}
