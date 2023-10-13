package com.lt.mail;


import java.util.HashMap;
import java.util.Map;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Mail {
	private static JavaMailSenderImpl sender = new JavaMailSenderImpl();
	
	private static Map<String,String> mailMap = new HashMap<>(); 
	
	static {
		String host = "smtp.qq.com";
		String fromMail = "*********@qq.com";
		String toMail = "*********@qq.com";
		/**
		 * 授权码15分钟需要在qq邮箱里授权一次
		 */
		String authorizeCode = "hexgbqevkbqpdjdc";
	
		sender.setHost(host);
		sender.setUsername(fromMail);
		sender.setPassword(authorizeCode);
		
		mailMap.put("fromMail", fromMail);
		mailMap.put("toMail", toMail);
	}
	
	public void sendMail(String subject,String content) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom(mailMap.get("fromMail"));
		mail.setTo(mailMap.get("toMail"));
		mail.setSubject(subject);
		mail.setText(content);
		sender.send(mail);
	}
}
