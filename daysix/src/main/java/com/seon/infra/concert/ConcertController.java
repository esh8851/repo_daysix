package com.seon.infra.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConcertController {
	
	@Autowired
	ConcertService concertService;
	
	@RequestMapping(value="/v1/infra/concert/concertUsrList")
	public String concertUsrList() {
		return "/usr/v1/infra/concert/concertUsrList";
	}

	@RequestMapping(value="/v1/infra/concert/concertUsrDetail")
	public String concertUsrDatail() {
		return "/usr/v1/infra/concert/concertUsrDetail";
	}
	
}
