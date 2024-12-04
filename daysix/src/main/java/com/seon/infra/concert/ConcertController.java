package com.seon.infra.concert;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

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
//		model.addAttribute("list", concertService.selectList(concertVo));
		return "xdm/v1/infra/concert/concertXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmForm")
	public String concertXdmForm() {
		return "xdm/v1/infra/concert/concertXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmInst")
	public String concertXdmInst(ConcertDto concertDto) throws Exception {
		concertService.insert(concertDto, 1, "images", 0, "1");
		return "redirect:/v1/infra/concert/concertXdmList";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertXdmMForm")
	public String concertXdmMForm(Model model, ConcertDto concertDto) {
		model.addAttribute("item", concertService.selectOne(concertDto));
		return "xdm/v1/infra/concert/concertXdmMForm";
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
	public String concertUsrList(@ModelAttribute("vo") ConcertVo concertVo, Model model, ConcertDto concertDto) {
		concertVo.setParamsPaging(concertService.selectOneCount(concertVo));
		if (concertVo.getTotalRows() > 0) {
			model.addAttribute("list", concertService.selectList(concertVo));
		}
		return "usr/v1/infra/concert/concertUsrList";
	}

	@RequestMapping(value="/v1/infra/concert/concertUsrDetail")
	public String concertUsrDatail(@ModelAttribute ConcertVo concertVo, Model model, ConcertDto concertDto) {
		model.addAttribute("item", concertService.selectOne(concertDto));
		model.addAttribute("replyList", concertService.selectListReply(concertDto));
		model.addAttribute("replyCount", concertService.selectOneCountReply(concertDto));
		model.addAttribute("scoreAvg", concertService.selectOneAvg(concertDto));
		model.addAttribute("itemImg", concertService.selectOneImg(concertDto));
		return "usr/v1/infra/concert/concertUsrDetail";
	}
	
	@RequestMapping(value="/v1/infra/concert/concertUsrReplyInst")
	public String concertUsrReplyInst(Model model, @ModelAttribute("vo") ConcertVo concertVo,ConcertDto concertDto, HttpSession httpSession) {
		concertDto.setMember_mmSeq(httpSession.getAttribute("sessSeqUsr").toString());
		concertService.insertReply(concertDto);
		return "redirect:/v1/infra/concert/concertUsrDetail?concertSeq=" + concertDto.getConcert_concertSeq();
	}
	
	@ResponseBody
	@RequestMapping(value="/v1/infra/concert/concertUsrInst")
	public Map<String, Object> concertUsrInst(ConcertDto concertDto) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		concertService.insertScore(concertDto);
		returnMap.put("rt", "success");
		return returnMap;
	}
	
	@ResponseBody
	@RequestMapping(value="/v1/infra/concert/replyUsrProc")
	public Map<String, Object> replyUsrProc(ConcertDto concertDto) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("rt", "success");
		return returnMap;
	}
	
	
}
