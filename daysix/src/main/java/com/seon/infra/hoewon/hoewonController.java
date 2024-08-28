package com.seon.infra.hoewon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hoewonController {
	
	@Autowired
	hoewonService hoewonService;
	
	@RequestMapping(value="/v1/infra/hoewon/hoewonUsr")
	public String hoewon() {
		List<hoewonDto> hoewons = hoewonService.selectService();
		System.out.println(hoewons.size());
		for(hoewonDto hoewoni: hoewons) {
			System.out.println(hoewoni.getSeq() + "|" + hoewoni.getAdminNy() + "|" + hoewoni.getHoewonName() + "|" + hoewoni.getHoewonId() + "|" + hoewoni.getHoewonPw() + "|" + hoewoni.getHoewonGender() + "|" + hoewoni.getHoewonBirth() + "|" + hoewoni.getHoewonEmail() + "|" + hoewoni.getHoewonEmail() + "|" + hoewoni.getHoewonPhone() + "|" + hoewoni.getHoewonDesc() + "|" + hoewoni.getHoewonRegDateTime() + "|" + hoewoni.getHoewonModDateTime());
		}
		return "/usr/v1/infra/hoewon/hoewonUsr";
	}

}
