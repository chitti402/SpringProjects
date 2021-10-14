package com.spring.online.onlineQuizClient1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class OnlineQuizcontroller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/client1")
	public String getmoney() {
		//https://api.dictionaryapi.dev/api/v2/entries/en/hello
		String url="https://OnlineQuizSerivce/quiz/service1";
		return restTemplate.getForObject(url, String.class);		
	}
}
