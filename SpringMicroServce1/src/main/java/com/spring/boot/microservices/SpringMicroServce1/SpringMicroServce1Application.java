package com.spring.boot.microservices.SpringMicroServce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
@SpringBootApplication
@RestController
public class SpringMicroServce1Application {
	
	private final WebClient.Builder loadBalancedWebClientBuilder;
	  private final ReactorLoadBalancerExchangeFilterFunction lbFunction;

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServce1Application.class, args);
	}

}
