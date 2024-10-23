package com.seon.infra.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConcertController {
	
	@Autowired
	ConcertService concertService;
	
//	Xdm
	@RequestMapping(value="/v1/infra/concert/concertXdmList")
	public String concertXdmList(@ModelAttribute("vo") ConcertVo concertVo, Model model) {
		// 날짜 필드에 시간 추가
		concertVo.setShDateStart(concertVo.getShDateStart()+" 00:00:00");			
		concertVo.setShDateEnd(concertVo.getShDateEnd()+" 23:59:59");
		// paging
		concertVo.setParamsPaging(concertService.selectOneCount(concertVo));
		if (concertVo.getTotalRows() > 0) {
			model.addAttribute("list", concertService.selectList(concertVo));
		}
		model.addAttribute("list", concertService.selectList(concertVo));
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
	
	@RequestMapping(value="/v1/infra/concert/concertXdmUpdt")
	public String concertXdmUpt(ConcertDto concertDto) {
		concertService.update(concertDto);
		return "redirect:/v1/infra/concert/concertXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmDel")
	public String concertXdmDel(ConcertDto concertDto) {
		concertService.delete(concertDto);
		return "redirect:/v1/infra/concert/concertXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmUel")
	public String concertXdmUel(ConcertDto concertDto) {
		concertService.uelete(concertDto);
		return "redirect:/v1/infra/concert/concertXdmList";
	}
	
	
//	Usr
	@RequestMapping(value="/v1/infra/concert/concertUsrList")
	public String concertUsrList(@ModelAttribute("vo") ConcertVo concertVo, Model model) {
		concertVo.setParamsPaging(concertService.selectOneCount(concertVo));
		if (concertVo.getTotalRows() > 0) {
			model.addAttribute("list", concertService.selectList(concertVo));
		}
		return "/usr/v1/infra/concert/concertUsrList";
	}

	@RequestMapping(value="/v1/infra/concert/concertUsrDetail")
	public String concertUsrDatail(Model model, ConcertDto concertDto, ConcertVo concertVo) {
		model.addAttribute("item", concertService.selectOne(concertDto));
		return "/usr/v1/infra/concert/concertUsrDetail";
	}
	
}
