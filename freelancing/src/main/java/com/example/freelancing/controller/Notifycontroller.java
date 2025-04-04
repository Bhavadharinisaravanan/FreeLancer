package com.example.freelancing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.freelancing.service.Notifyservice;


@RestController
public class Notifycontroller {
	@Autowired Notifyservice ser;
	@PostMapping("/mail")
	public String email(@RequestParam String receiver,@RequestParam String  subject,@RequestParam String body)
	{
		return ser.sendmail(receiver,subject,body);
	}
}
