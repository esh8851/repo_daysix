package com.seon.infra.member;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import jakarta.servlet.http.HttpSession;

@RestController
public class KakaoLoginController {
	
	@Autowired
	private HttpSession httpSession;
	
	@PostMapping("/kakao-login")
    public ResponseEntity<?> kakaoLogin(@RequestBody KakaoTokenDTO kakaoToken) {
        // 카카오 API를 호출하여 사용자 정보를 가져옵니다.
        String accessToken = kakaoToken.getAccessToken();
        String url = "https://kapi.kakao.com/v2/user/me";

        // 인증 헤더 추가
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // 카카오 사용자 정보 가져오기
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        // 응답 처리 (예: 사용자 정보 출력)
        String responseBody = response.getBody();
        System.out.println("Response from Kakao: " + responseBody);
        
        processKakaoUserInfo(responseBody);

        // 성공적으로 처리했다면 성공 메시지 반환
        return ResponseEntity.ok().body("{\"success\": true}");
    }
    
    public void processKakaoUserInfo(String responseBody) {
        JSONObject jsonResponse = new JSONObject(responseBody);
        Long userId = jsonResponse.getLong("id");
        JSONObject properties = jsonResponse.getJSONObject("properties");
        String nickname = properties.getString("nickname");
        
        // 여기에서 사용자의 정보를 DB에 저장하거나 세션에 저장할 수 있습니다.
        System.out.println("User ID: " + userId);
        System.out.println("Nickname: " + nickname);
        
        httpSession.setAttribute("sessSeqUsr", userId);
        httpSession.setAttribute("sessNameUsr", nickname);
        
    }

}
