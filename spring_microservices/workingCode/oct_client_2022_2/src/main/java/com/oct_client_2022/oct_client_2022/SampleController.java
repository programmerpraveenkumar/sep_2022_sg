package com.oct_client_2022.oct_client_2022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service2")
public class SampleController {
    @GetMapping("sampleapi")
    public String getName(){
            return "sample response from client2";
    }
}
