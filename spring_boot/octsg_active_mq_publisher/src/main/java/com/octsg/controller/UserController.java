package com.octsg.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

/*
//ResponseEntity.ok() --> success response with 200 status code
//ResponseEntity.badRequest().body() ->failure respone with 400 status code

 */
@RestController
//@RequestMapping("user")
public class UserController {
        @Autowired
        JmsTemplate jmsTemplate;

        @GetMapping("test")//this end point will match /user
        public ResponseEntity<?> test(){
           return ResponseEntity.ok("ok");
        }

        @GetMapping("publish")//this end point will match /user
        public ResponseEntity<?> getUser(){
            jmsTemplate.convertAndSend("oct2022","some message");
            return ResponseEntity.ok("ok");
        }


}
