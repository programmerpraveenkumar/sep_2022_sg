package com.server_oct_2022.server_oct_2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerOct2022Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerOct2022Application.class, args);
	}

}
