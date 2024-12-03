package com.seon.infra.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/v1/infra/book/bookUsrFirst")
	public String bookUsrFirst(Model model, BookDto bookDto) {
		model.addAttribute("list", bookService.selectList(bookDto));
		model.addAttribute("listTicket", bookService.selectListTicket());
		return "usr/v1/infra/book/bookUsrFirst";
	}
	
	@RequestMapping(value="/v1/infra/book/bookUsrSecond")
	public String bookUsrSecond(Model model, BookDto bookDto) {
		model.addAttribute("listSeatA", bookService.selectListSeatA(bookDto));
		model.addAttribute("listSeatB", bookService.selectListSeatB(bookDto));
		model.addAttribute("listSeatC", bookService.selectListSeatC(bookDto));
		model.addAttribute("listSeatD", bookService.selectListSeatD(bookDto));
		return "usr/v1/infra/book/bookUsrSecond";
	}

}
