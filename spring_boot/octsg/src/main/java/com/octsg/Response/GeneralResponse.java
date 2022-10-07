package com.octsg.Response;

import com.sun.tools.javah.Gen;

public class GeneralResponse {
    String message;
    String myName;
    public String getMyName() {
        return myName;
    }
    public GeneralResponse(){

    }
    public void setMyName(String myName) {
        this.myName = myName;
    }


    public GeneralResponse(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
