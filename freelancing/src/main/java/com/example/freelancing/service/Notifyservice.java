package com.example.freelancing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.freelancing.entity.Notifyentity;
import com.example.freelancing.repo.Notifyrepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class Notifyservice {
	@Autowired JavaMailSender sender;
	@Autowired Notifyrepo rep;
	public String sendmail(String receiver,String subject,String body) {
		try {
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setTo(receiver);
			helper.setSubject(subject); //attachments
			helper.setText(body,true);
			sender.send(message);
		Notifyentity email=new Notifyentity();
		email.setReceiver(receiver);
		email.setSubject(subject);
		email.setBody(body);
		rep.save(email);
		return "Email Send Successfully "+receiver;
		
	}
	catch (MessagingException e) {
		return "Email Not Found"+e.getMessage();
	}
}
	
	

}
