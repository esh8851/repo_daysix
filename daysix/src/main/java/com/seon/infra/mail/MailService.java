package com.seon.infra.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMailSimple() {
    	SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    	
    	simpleMailMessage.setTo("esh8851@gmail.com");
    	simpleMailMessage.setSubject("안녕하세요");
//    	simpleMailMessage.setFrom("esh8851@gmail.com");
    	simpleMailMessage.setText("안녕하세요\n\n 잘지내고 계시죠\n\n 쓰레드 썼다\n\n 로그인");

    	javaMailSender.send(simpleMailMessage);

    }

}
