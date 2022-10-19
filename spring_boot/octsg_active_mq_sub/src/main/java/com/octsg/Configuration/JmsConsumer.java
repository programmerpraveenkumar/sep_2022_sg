package com.octsg.Configuration;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    @JmsListener(destination = "oct2022")
    public void messageListener(String message){
        System.out.println(message);
    }
}
