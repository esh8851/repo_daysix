package com.seon.infra.codegroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.seon.common.util.UtilDateTime;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo codeGroupVo, Model model) throws IOException {
		
//		paging
		codeGroupVo.setParamsPaging(codeGroupService.selectOneCount(codeGroupVo));
		if (codeGroupVo.getTotalRows() > 0) {
			model.addAttribute("list", codeGroupService.selectService(codeGroupVo));
		}
		
//		날짜 필드에 시간 추가
//		codeGroupVo.setShDateStart(codeGroupVo.getShDateStart()+" 00:00:00");
//		codeGroupVo.setShDateEnd(codeGroupVo.getShDateEnd()+" 23:59:59");
		
		/* 초기값 세팅이 없는 경우 사용 */
		codeGroupVo.setShDateStart(codeGroupVo.getShDateStart() == null || codeGroupVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codeGroupVo.getShDateStart()));
		codeGroupVo.setShDateEnd(codeGroupVo.getShDateEnd() == null || codeGroupVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codeGroupVo.getShDateEnd()));
		
//		자바객체를 html으로 전달할 때는 Model객체 사용
//		codeGroups 자바 객체를 "list" 라는 이름의 변수명으로 html에 전달
//		List<CodeGroupDto> codeGroups = codeGroupService.selectService();
//		model.addAttribute("list", codeGroups);
		
//		자바에서 더 코딩을 하지않고 값만 넘겨줄 때 codeGroupService.selectService() 사용
		model.addAttribute("list", codeGroupService.selectService(codeGroupVo));
		
//		System.out.println(codeGroups.size());
//		
//		for(CodeGroupDto groups: codeGroups) {
//			System.out.println(groups.getCgSeq() + "|" + groups.getCgName() + "|" + groups.getCgUseNy() + "|" + groups.getCgOrder() + "|" + groups.getCgDesc() + "|" + groups.getDelNy() + "|" + groups.getCgDateTime() + "|" + groups.getCgDateTimeSvr());
//		}
		
//		API
//        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getCovidDagnsRgntProdExprtStusInq"); /*URL*/
//        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=nB6NdWetzSrcRvCx6o0WrgOjWDDlJ2wnT3vslxv%2BaCTpN9DDmqmKXDzJ0Q2xuBh4Y27RRTJZaGM6y4VlOFYpNg%3D%3D"); /*Service Key*/
//        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
//        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
//        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
//        urlBuilder.append("&" + URLEncoder.encode("YYYY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*년도*/
//        urlBuilder.append("&" + URLEncoder.encode("MM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*실적월*/
//        URL url = new URL(urlBuilder.toString());
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Content-type", "application/json");
//        System.out.println("Response code: " + conn.getResponseCode());
//        BufferedReader rd;
//        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        } else {
//            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//        }
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = rd.readLine()) != null) {
//            sb.append(line);
//        }
//        rd.close();
//        conn.disconnect();
//        System.out.println(sb.toString());
//        
//        ObjectMapper objectMapper = new ObjectMapper();
//		JsonNode node = objectMapper.readTree(sb.toString());
//		
//		System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node.get("header").get("resultCode").asText());
//		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("header").get("resultMsg").asText());
//		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("body").get("items").get(0).get("KIT_PROD_QTY").asText());
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getMmCovidDagnsRgntExprtStusInq"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=nB6NdWetzSrcRvCx6o0WrgOjWDDlJ2wnT3vslxv%2BaCTpN9DDmqmKXDzJ0Q2xuBh4Y27RRTJZaGM6y4VlOFYpNg%3D%3D"); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
		urlBuilder.append("&" + URLEncoder.encode("YYYY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*년도*/
		urlBuilder.append("&" + URLEncoder.encode("MM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*실적월*/
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = objectMapper.readTree(sb.toString());
		
		System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node.get("header").get("resultCode").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("header").get("resultMsg").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("body").get("items").get(1).get("KIT_EXPRT_QTY").asText());
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) {
		System.out.println("codeGroupDto.getCgName() : " + codeGroupDto.getCgName());
		codeGroupService.insert(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
//	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmMForm")
//	public String codeGroupXdmMForm(CodeGroupDto codeGroupDto, Model model) {
//		CodeGroupDto dto = codeGroupService.selectOne(codeGroupDto);
//		model.addAttribute("item", dto);
//		return "/xdm/v1/infra/codegroup/codeGroupXdmMForm";
//	}
	
//	축약
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmMForm")
	public String codeGroupXdmMForm(CodeGroupDto codeGroupDto, Model model) {
		model.addAttribute("item", codeGroupService.selectOne(codeGroupDto));
		System.out.println("selectOne 잘 넘어감");
		return "/xdm/v1/infra/codegroup/codeGroupXdmMForm";
	}
	
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {
		codeGroupService.update(codeGroupDto);
		System.out.println("update 실행했다~");
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
//	uelete
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmUel")
	public String codeGroupXdmUel(CodeGroupDto codeGroupDto) {
		codeGroupService.uelete(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
//	delete
	@RequestMapping(value="/v1/infra/codegroup/codeGroupXdmDel")
	public String codeGroupXdmDel(CodeGroupDto codeGroupDto) {
		codeGroupService.delete(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}

}
