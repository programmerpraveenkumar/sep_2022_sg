package com.octsg.controller;

import com.octsg.Request.AddtionRequest;
import com.octsg.Request.UserRequest;
import com.octsg.Response.GeneralResponse;
import com.octsg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
//ResponseEntity.ok() --> success response with 200 status code
//ResponseEntity.badRequest().body() ->failure respone with 400 status code

 */
@RestController
//@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;//will create object for userservice in the controller
            //= new UserService();


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

//    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("addition")
    public ResponseEntity<?> addition(@RequestBody AddtionRequest addtionRequest){
        int res  = userService.addition(addtionRequest.getNum1(), addtionRequest.getNum2());
        GeneralResponse response = new GeneralResponse();
        response.setMessage("result is "+res);
        return ResponseEntity.ok(response);
    }
    @GetMapping("user/{user_id}")
    public ResponseEntity<?> getUser(@PathVariable Integer user_id){
        GeneralResponse response = new GeneralResponse();
        response.setMessage("user id is "+user_id);
        return ResponseEntity.ok(response);
    }

    @PostMapping("user/update")
    public ResponseEntity<?> updateUser(
                                        @RequestBody UserRequest userRequest){
        //call user service for update

        GeneralResponse response = new GeneralResponse();
        response.setMessage("update email is "+userRequest.getEmail());
        return ResponseEntity.ok(response);
    }
    @PostMapping("user/update/{user_id}")
    public ResponseEntity<?> updateUser(@PathVariable Integer user_id,
                                        @RequestBody UserRequest userRequest){
        //call user service for update

        GeneralResponse response = new GeneralResponse();
        response.setMessage("User id is  "+user_id+"update email is "+userRequest.getEmail());
        return ResponseEntity.ok(response);
    }

    @PostMapping("userLogin")
    public ResponseEntity<?> userlogin(@RequestBody UserRequest userRequest){

        //arraylist with user data .
        GeneralResponse response = new GeneralResponse();
        try{
            userService.validateUserLogin(userRequest.getEmail(),userRequest.getPassword());
            response.setMessage("you are correct");
            return ResponseEntity.ok(response);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("userLoginParam")
    public ResponseEntity<?> userlogin(@RequestParam String password,
                                       @RequestParam String email){
        GeneralResponse response = new GeneralResponse();
        response.setMessage(password+" -- "+email);
        return ResponseEntity.ok(response);
    }

    @PostMapping("userRegister")
    public ResponseEntity<?> userRegister(){
        GeneralResponse response = new GeneralResponse();
        try{
            userService.createUser();
            response.setMessage("Register success");
            return ResponseEntity.ok(response);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
}
