package com.chitti.spring.SpringcloudserviceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chitti.spring.SpringcloudsericeDemo.DTO.QuatwtAnswer;
import com.chitti.spring.SpringcloudsericeDemo.services.SPringcloudserviceDemoService;

@SpringBootApplication
@RestController
public class SpringcloudserviceDemoApplication {

	
	@Autowired
	SPringcloudserviceDemoService SpringService;
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudserviceDemoApplication.class, args);
	}
	
	@GetMapping("/getAllproducts")
	public String getAllproducts(QuatwtAnswer quatwtanswer) {
		
		return SpringService.getDetails(quatwtanswer);
	}

}
