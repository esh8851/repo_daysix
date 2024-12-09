package com.seon.infra.book;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

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
		model.addAttribute("listSeatE", bookService.selectListSeatE(bookDto));
		model.addAttribute("listSeatF", bookService.selectListSeatF(bookDto));
		model.addAttribute("listSeatG", bookService.selectListSeatG(bookDto));
		model.addAttribute("listSeatI", bookService.selectListSeatI(bookDto));
		model.addAttribute("listSeatJ", bookService.selectListSeatJ(bookDto));
		model.addAttribute("listSeatK", bookService.selectListSeatK(bookDto));
		model.addAttribute("listSeatL", bookService.selectListSeatL(bookDto));
		return "usr/v1/infra/book/bookUsrSecond";
	}
	
	@RequestMapping(value="/v1/infra/book/bookUsrThirdBuy")
	public String bookUsrThirdBuy() {
		return "usr/v1/infra/book/bookUsrThirdBuy";
	}
	
	@RequestMapping(value="/v1/infra/book/bookUsrFinal")
	public String bookUsrFinal() {
		return "usr/v1/infra/book/bookUsrFinal";
	}
	
	@ResponseBody
	@RequestMapping(value="/v1/infra/book/bookUsrProc")
	public Map<String, Object> bookUsrProc(@RequestParam("bookCount") int bookCount, @RequestParam("bookPrice") int bookPrice, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.setAttribute("bookCount", bookCount);
		httpSession.setAttribute("bookPrice", bookPrice);
		returnMap.put("rt", "success");
		return returnMap;
	}

}
