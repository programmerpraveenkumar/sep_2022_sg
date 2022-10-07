package com.octsg.controller;

import com.octsg.Request.AddtionRequest;
import com.octsg.Request.UserRequest;
import com.octsg.Response.GeneralResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
//ResponseEntity.ok() --> success response with 200 status code
//ResponseEntity.badRequest().body() ->failure respone with 400 status code

 */
@RestController
public class UserController {
    @GetMapping("user")//this end point will match /user
    public ResponseEntity<GeneralResponse> getUser(){
        GeneralResponse response = new GeneralResponse();
       response.setMyName("this is for user url");
        return ResponseEntity.ok(response);//passing the obj wch ll convert into json response

    }
    /*
    ResponseEntity<GeneralResponse>
    ResponseEntity<?>
     */
    @GetMapping("message")//this end point will match /user
    public ResponseEntity<?> getMessage(){
        GeneralResponse response = new GeneralResponse();
        response.setMessage("this is for messag url");
        return ResponseEntity.ok(response);//pas
//        HashMap<String ,String> obj = new HashMap<>();
//        obj.put("user","this is user");
        //return ResponseEntity.ok(obj);//passing the obj wch ll convert into json response

    }

    @PostMapping("addition")
    public ResponseEntity<?> addition(@RequestBody AddtionRequest addtionRequest){
        int res  = addtionRequest.getNum1()+addtionRequest.getNum2();
        GeneralResponse response = new GeneralResponse();
        response.setMessage("result is "+res);
        return ResponseEntity.ok(response);
    }

    @PostMapping("userLogin")
    public ResponseEntity<?> userlogin(@RequestBody UserRequest userRequest){

        //arraylist with user data .
        GeneralResponse response = new GeneralResponse();
        if(userRequest.getEmail().equals("admin@gmail.com") &&  userRequest.getPassword().equals("admin")){
            response.setMessage("You are correct");
            return ResponseEntity.ok(response);//200 status  code
        }else{
            response.setMessage("Please provide the proper email or password");
            return ResponseEntity.badRequest().body(response);//400 status code
        }

    }
}
