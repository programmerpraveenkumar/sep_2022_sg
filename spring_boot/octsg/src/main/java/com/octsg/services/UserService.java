package com.octsg.services;


import com.octsg.Repo.UserRepo;
import com.octsg.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public int addition(int a, int b){
            return a+b;
    }

    public boolean validateUserLogin(String email,String password)throws  Exception{
        if(email.equals("admin@gmail.com") &&  password.equals("admin")){
            return true;
        }else{
            throw new Exception("Please provide the username and password");

        }
    }

    public boolean createUser() throws  Exception{
        try{
            UserModel userModel = new UserModel();
//            userModel.setEmail("test@gmail.com");
//            userModel.setMobile("455454");
            userModel.setName("test");
            userModel.setId(10);
            userRepo.save(userModel);//insert the data in table.
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }


    }
}
