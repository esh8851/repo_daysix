package com.seon.infra.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConcertController {
	
	@Autowired
	ConcertService concertService;
	
//	Xdm
	@RequestMapping(value="/v1/infra/concert/concertXdmList")
	public String concertXdmList(Model model) {
		model.addAttribute("list", concertService.selectList());
		return "/xdm/v1/infra/concert/concertXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmForm")
	public String concertXdmForm() {
		return "/xdm/v1/infra/concert/concertXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmInst")
	public String concertXdmInst(ConcertDto concertDto) {
		concertService.insert(concertDto);
		return "redirect:/v1/infra/concert/concertXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmMForm")
	public String concertXdmMForm(Model model, ConcertDto concertDto) {
		model.addAttribute("item", concertService.selectOne(concertDto));
		return "/xdm/v1/infra/concert/concertXdmMForm";
	}
	
	
//	Usr
	@RequestMapping(value="/v1/infra/concert/concertUsrList")
	public String concertUsrList() {
		return "/usr/v1/infra/concert/concertUsrList";
	}

	@RequestMapping(value="/v1/infra/concert/concertUsrDetail")
	public String concertUsrDatail() {
		return "/usr/v1/infra/concert/concertUsrDetail";
	}
	
}
