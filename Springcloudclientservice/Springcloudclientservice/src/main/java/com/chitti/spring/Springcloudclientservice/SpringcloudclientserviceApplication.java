package com.chitti.spring.Springcloudclientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringcloudclientserviceApplication {

	@Value("${springcloud.servicedemo.provider.url}")
	private String url;
	
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping("/getPlan")
	public String getPlan() {
		String plans= restTemplate.getForObject(url, String.class);
	
	return plans;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudclientserviceApplication.class, args);
	}

}
