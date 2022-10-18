package com.oct_client_2022.oct_client_2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("service1")
public class SampleController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @GetMapping("sampleget")
    public String callAPi() {
        String response = restTemplate.getForObject("http://localhost:8081/sampleapi", String.class);
        System.out.println("another service response is " + response);
        return "ok";
    }

    private String callMeIfError(){
        //add some success data..
            return "Error happend.but success can sent.";
    }

    @GetMapping("samplegettest")
    public String getAlbumList() {
        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
         String url = "https://jsonplaceholder.typicode.com/albums";
        //String url = "http://localhost:1234/not-real";
        //String url = "https://jsonplaceholder.typicode.com/albums";
//    restTemplate.getForObject()//get
//        restTemplate.postForObject()//get
        return circuitBreaker.run(() -> restTemplate.getForObject(url, String.class),
                throwable ->callMeIfError());
    }

}

