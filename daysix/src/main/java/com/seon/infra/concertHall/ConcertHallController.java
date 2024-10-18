package com.seon.infra.concertHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConcertHallController {
	
	@Autowired
	ConcertHallService concertHallService;
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmList")
	public String concertHallXdmList() {
		return "/xdm/v1/infra/concertHall/concertHallXdmList";
	}

}
