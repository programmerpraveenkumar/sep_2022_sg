package com.octsg.controller;

import com.octsg.Request.AddtionRequest;
import com.octsg.Request.UserRequest;
import com.octsg.Response.GeneralResponse;
import com.octsg.model.UserModel;
import com.octsg.services.UserService;
import java.util.List;

import org.apache.catalina.User;
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
        //return ResponseEntity.ok(response);//passing the obj wch ll convert into json response
        return ResponseEntity.badRequest().body(response);//passing the obj wch ll convert into json response

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
        System.out.println("inside addition.");
        GeneralResponse response = new GeneralResponse();
        response.setMessage("result is "+res);
        System.out.println("end of the controller");
        return ResponseEntity.ok(response);
    }
    @GetMapping("user/{user_id}")
    public ResponseEntity<?> getUser(@PathVariable Integer user_id){
        GeneralResponse response = new GeneralResponse();
        response.setMessage("user id is "+user_id);
        return ResponseEntity.ok(response);
    }

    @PostMapping("user/update")
    public ResponseEntity<?> updateUser( @RequestBody UserRequest userRequest){
        GeneralResponse response = new GeneralResponse();
             try{
                userService.updateUser(userRequest);
                response.setMessage("update success");
                return ResponseEntity.ok(response);
            }catch (Exception e){
                response.setMessage(e.getMessage());
                return ResponseEntity.badRequest().body(response);
            }

    }
    @PostMapping("user/update/{user_id}")
    public ResponseEntity<?> updateUser(@PathVariable Integer user_id,
                                        @RequestBody UserRequest userRequest){
        //call user service for update

        GeneralResponse response = new GeneralResponse();
        response.setMessage("User id is  "+user_id+"update email is "+userRequest.getEmail());
        return ResponseEntity.ok(response);
    }
    @PostMapping("user/delete/{user_id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer user_id){
        GeneralResponse response = new GeneralResponse();
        try{
            userService.deleteUser(user_id);
            response.setMessage("User is deleted");
            return ResponseEntity.ok(response);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

    }


    @PostMapping("user/userLogin")
    public ResponseEntity<?> userlogin(@RequestBody UserRequest userRequest){
        try{
            UserModel user = userService.validateUserLogin(userRequest.getEmail(),userRequest.getPassword());
            return ResponseEntity.ok(user);
        }catch (Exception e){
            GeneralResponse response = new GeneralResponse();
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("user/tokencheck")
    public ResponseEntity<?> tokencheck( @RequestHeader String token,@RequestHeader String user_id){
        try{
            System.out.println("token is "+token+" user_id"+user_id);
            return ResponseEntity.ok(token);
        }catch (Exception e){
            GeneralResponse response = new GeneralResponse();
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
    public ResponseEntity<?> userRegister(@RequestBody UserRequest userRequest){
        GeneralResponse response = new GeneralResponse();
        try{
            userService.createUser(userRequest);
            response.setMessage("Register success");
            return ResponseEntity.ok(response);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("listuser")
    public ResponseEntity<?> listuser(){
        try{

            List<UserModel> list = userService.listUser();
            return ResponseEntity.ok(list);//json response will be generated from the list.
        }catch (Exception e){
            GeneralResponse response = new GeneralResponse();
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("user/logout/{userId}")
    public ResponseEntity<?> listuser(@PathVariable Integer userId){
        GeneralResponse  response = new GeneralResponse();
        try{
            userService.logout(userId);
            response.setMessage("Logout successful");
            return ResponseEntity.ok(response);//json response will be generated from the list.
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("listuser/{user_tmp_id}")
    public ResponseEntity<?> listuserById(@PathVariable Integer user_tmp_id){
        try{
           UserModel um  = userService.listUser(user_tmp_id);
            return ResponseEntity.ok(um);//json response will be generated from the list.
        }catch (Exception e){
            GeneralResponse response = new GeneralResponse();
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
}
