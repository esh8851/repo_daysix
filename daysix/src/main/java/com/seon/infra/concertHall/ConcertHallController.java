package com.seon.infra.concertHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConcertHallController {
	
	@Autowired
	ConcertHallService concertHallService;
	
//	Xdm
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmList")
	public String concertHallXdmList(@ModelAttribute("vo") ConcertHallVo concertHallVo, Model model) {
		// 날짜 필드에 시간 추가
		concertHallVo.setShDateStart(concertHallVo.getShDateStart()+" 00:00:00");			
		concertHallVo.setShDateEnd(concertHallVo.getShDateEnd()+" 23:59:59");
		// paging
		concertHallVo.setParamsPaging(concertHallService.selectOneCount(concertHallVo));
		if (concertHallVo.getTotalRows() > 0) {
			model.addAttribute("list", concertHallService.selectList(concertHallVo));
		}
		model.addAttribute("list", concertHallService.selectList(concertHallVo));
		return "xdm/v1/infra/concertHall/concertHallXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmForm")
	public String concertHallXdmForm() {
		return "xdm/v1/infra/concertHall/concertHallXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmInst")
	public String concertHallXdmInst(ConcertHallDto concertHallDto) {
		concertHallService.insert(concertHallDto);
		return "redirect:/v1/infra/concertHall/concertHallXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmMForm")
	public String concertHallXdmMForm(Model model, ConcertHallDto concertHallDto) {
		model.addAttribute("item", concertHallService.selectOne(concertHallDto));
		return "xdm/v1/infra/concertHall/concertHallXdmMForm";
	}
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmUpdt")
	public String concertHallXdmUpt(ConcertHallDto concertHallDto) {
		concertHallService.update(concertHallDto);
		return "redirect:/v1/infra/concertHall/concertHallXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmDel")
	public String concertHallXdmDel(ConcertHallDto concertHallDto) {
		concertHallService.delete(concertHallDto);
		return "redirect:/v1/infra/concertHall/concertHallXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concertHall/concertHallXdmUel")
	public String concertHallXdmUel(ConcertHallDto concertHallDto) {
		concertHallService.uelete(concertHallDto);
		return "redirect:/v1/infra/concertHall/concertHallXdmList";
	}
	
//	Usr
	@RequestMapping(value="/v1/infra/concert/concertUsrListHall")
	public String concertUsrList(Model model, ConcertHallDto concertHallDto) {
		model.addAttribute("itemHall", concertHallService.selectOne(concertHallDto));
		return "usr/v1/infra/concert/concertUsrList";
	}
	
}
