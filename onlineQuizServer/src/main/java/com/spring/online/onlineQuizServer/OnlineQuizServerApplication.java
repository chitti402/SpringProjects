package com.spring.online.onlineQuizServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineQuizServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizServerApplication.class, args);
	}

}
