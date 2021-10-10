package com.chitti.spring.SpringcloudserviceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcloudserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudserviceDemoApplication.class, args);
	}
	
	@GetMapping("/getAllproducts")
	public String getAllproducts() {
		
		return "Hello Spring Microservices";
	}

}
