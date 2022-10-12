package com.octsg.services;


import com.octsg.Repo.UserRepo;
import com.octsg.Request.UserRequest;
import com.octsg.model.UserModel;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
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

    public UserModel validateUserLogin(String email,String password)throws  Exception{
        UserModel user =  userRepo.getUserByEmailAndPassword(email,password).orElseThrow(()->new Exception("Please provide the username and password"));
        return  user;
    }

    public boolean createUser(UserRequest userRequest) throws  Exception{
        try{
            Optional<UserModel> userExistOpt = userRepo.getUserByEmail(userRequest.getEmail());
            if(userExistOpt.isPresent()){
                throw  new Exception("Email is already exist");
            }

            UserModel userModel = new UserModel();
           userModel.setEmail(userRequest.getEmail());
            userModel.setMobile(userRequest.getMobile());
            userModel.setName(userRequest.getName());
            userModel.setPassword(userModel.getPassword());
            userRepo.save(userModel);//insert the data in table.
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    public boolean deleteUser(Integer userId) throws  Exception{
        //java 8 optional
        UserModel userModelTmp = userRepo.findById(userId).orElseThrow(()->new Exception("No user found"));//get the data bases on primary key
        userRepo.delete(userModelTmp);
        return  true;
    }
    public boolean updateUser(UserRequest userRequest) throws  Exception{
        try{
            //java 8 optional
            Optional<UserModel> userModelOpt = userRepo.findById(userRequest.getId());//get the data bases on primary key

            //user is exist
            if(userModelOpt.isPresent()){
                UserModel userModelTmp = userModelOpt.get();//get the exsiting data using id
                if(userRequest.getEmail() != null && !userRequest.getEmail().equals("")){
                    userModelTmp.setEmail(userRequest.getEmail());
                }
                if(userRequest.getMobile() != null && !userRequest.getMobile().equals("")){
                    userModelTmp.setMobile(userRequest.getMobile());
                }
                if(userRequest.getName() != null && !userRequest.getName().equals("")){
                    userModelTmp.setName(userRequest.getName());
                }
                userRepo.save(userModelTmp);//update the data as it has Primary key
               return true;
            }else{
                throw  new Exception("user is not found");
            }

            /*
            //2nd syntax start
            UserModel userModelTmp = userRepo.findById(userRequest.getId()).orElseThrow(()->new Exception("no user found"));//get the data bases on primary key
            if(userRequest.getEmail() != null && !userRequest.getEmail().equals("")){
                userModelTmp.setEmail(userRequest.getEmail());
            }
            if(userRequest.getMobile() != null && !userRequest.getMobile().equals("")){
                userModelTmp.setMobile(userRequest.getMobile());
            }
            if(userRequest.getName() != null && !userRequest.getName().equals("")){
                userModelTmp.setName(userRequest.getName());
            }

            userRepo.save(userModelTmp);//update the data as it has Primary key
            //2nd syntax end
            */

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    public List<UserModel> listUser() throws  Exception {
//        List<UserModel> userList = userRepo.findAll();
//        for (UserModel userModel : userList) {
//            System.out.println(userModel.getId() + " " + userModel.getEmail());
//        }

//        userRepo.findAll().forEach((obj) -> {
//            System.out.println(obj.getId() + " " + obj.getEmail());
//        });
        return userRepo.findAll();//get all the data from the userModel table.


    }
    public  UserModel listUser(Integer userId) throws  Exception {
        Optional<UserModel> userModel = userRepo.findById(userId);//get the data bases on primary key
        //user is exist
        if(userModel.isPresent()){
            return userModel.get();//get the usermodel the optional's userModel.
        }else{
            throw  new Exception("user is not found");
        }

    }
}
