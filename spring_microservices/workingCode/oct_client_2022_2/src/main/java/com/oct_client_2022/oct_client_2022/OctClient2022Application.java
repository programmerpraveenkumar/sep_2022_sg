package com.oct_client_2022.oct_client_2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient

public class OctClient2022Application {

	public static void main(String[] args) {
		SpringApplication.run(OctClient2022Application.class, args);

	}

@Bean
public RestTemplate getRestTemplate() {
	return new RestTemplate();
}
}

@Component
class ReConTool implements CommandLineRunner{
	@Autowired
	RestTemplate restTemplate;
	@Override
	public void run(String... args) throws Exception {
		try{
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("user-agent", "Application");
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			String response = restTemplate.exchange("https://reqres.in/api/users?page=2", HttpMethod.GET, entity, String.class).getBody();
			System.out.println(response);
		}catch (Exception e){
			e.printStackTrace();
		}

	}
}