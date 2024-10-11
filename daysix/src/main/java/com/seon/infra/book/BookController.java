package com.seon.infra.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@RequestMapping(value="/v1/infra/book/bookUsrFirst")
	public String bookUsrFirst() {
		return "/usr/v1/infra/book/bookUsrFirst";
	}
	
	@RequestMapping(value="/v1/infra/book/bookUsrSecond")
	public String bookUsrSecond() {
		return "/usr/v1/infra/book/bookUsrSecond";
	}

}
