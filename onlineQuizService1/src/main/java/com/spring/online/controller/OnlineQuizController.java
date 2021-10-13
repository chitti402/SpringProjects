package com.spring.online.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")

public class OnlineQuizController {
	
	
@GetMapping("/service1")
public String service() {
	
	return "Services1";
}


@GetMapping("/Quiz")
public String service1() {
	
	return "Services1";
}

}
