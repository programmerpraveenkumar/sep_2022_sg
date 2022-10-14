package com.octsg.Configuration;

import com.octsg.Response.GeneralResponse;
import com.sun.tools.javah.Gen;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExcepetion {
    /*
    common exception handler in spring boot application.
    */
//    @ExceptionHandler(Exception.class)//belwo method for handling exception.class from the spring boot application.
//    public ResponseEntity<?> handleException(Exception e){
//        System.out.println("inside handle excpetion(ExceptionHandler) "+e.getMessage());
//        GeneralResponse res = new GeneralResponse();
//        res.setMessage(e.getMessage());
//        return ResponseEntity.badRequest().body(res);
//    }
//    @ExceptionHandler(RuntimeException.class)//belwo method for handling exception.class from the spring boot application.
//    public ResponseEntity<?> handleException(RuntimeException e){
//        System.out.println("inside handle excpetion(ExceptionHandler) "+e.getMessage());
//        GeneralResponse res = new GeneralResponse();
//        res.setMessage(e.getMessage());
//        return ResponseEntity.badRequest().body(res);
//    }
    @ExceptionHandler(CustomException.class)//belwo method for handling exception.class from the spring boot application.
    public ResponseEntity<?> handleException(CustomException e){
        //send the error to client's mail
        //store the error for audit in the database.
        System.out.println("inside handle excpetion(ExceptionHandler) "+e.getMessage());
        GeneralResponse res = new GeneralResponse();
        res.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(res);
    }


}
