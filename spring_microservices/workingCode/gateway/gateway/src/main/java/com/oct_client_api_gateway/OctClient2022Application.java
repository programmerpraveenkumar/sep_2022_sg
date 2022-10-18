package com.oct_client_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OctClient2022Application {

	public static void main(String[] args) {
		SpringApplication.run(OctClient2022Application.class, args);
	}

}
