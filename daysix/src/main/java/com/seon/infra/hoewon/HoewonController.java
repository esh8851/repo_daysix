package com.seon.infra.hoewon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoewonController {
	
	@Autowired
	HoewonService hoewonService;
	
	@RequestMapping(value = "/v1/infra/hoewon/hoewonUsrList")
	public String hoewon(Model model) {
//		List<hoewonDto> hoewons = hoewonService.selectService();
//		System.out.println(hoewons.size());
//		for(hoewonDto hoewoni: hoewons) {
//			System.out.println(hoewoni.getSeq() + "|" + hoewoni.getAdminNy() + "|" + hoewoni.getHoewonName() + "|" + hoewoni.getHoewonId() + "|" + hoewoni.getHoewonPw() + "|" + hoewoni.getHoewonGender() + "|" + hoewoni.getHoewonBirth() + "|" + hoewoni.getHoewonEmail() + "|" + hoewoni.getHoewonEmail() + "|" + hoewoni.getHoewonPhone() + "|" + hoewoni.getHoewonDesc() + "|" + hoewoni.getHoewonRegDateTime() + "|" + hoewoni.getHoewonModDateTime());
//		}
		model.addAttribute("list", hoewonService.selectService());
		return "usr/v1/infra/hoewon/hoewonUsrList";
	}
	
	@RequestMapping(value="/v1/infra/hoewon/hoewonUsrForm")
	public String hoewonUsrForm() {
		return "usr/v1/infra/hoewon/hoewonUsrForm";
	}
	
	@RequestMapping(value="/v1/infra/hoewon/hoewonUsrInst")
	public String hoewonUsrInst(HoewonDto hoewondto) {
//		System.out.println("hoewondto.getHoewonName() ; " + hoewondto.getHoewonName());
		hoewonService.insert(hoewondto);
		return "redirect:/v1/infra/hoewon/hoewonUsrList";
	}

}
