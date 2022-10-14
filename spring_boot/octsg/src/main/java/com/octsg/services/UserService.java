package com.octsg.services;


import com.octsg.Configuration.CustomException;
import com.octsg.Repo.UserRepo;
import com.octsg.Request.UserRequest;
import com.octsg.model.UserModel;

import java.security.Key;
import java.time.temporal.ChronoUnit;
import java.util.*;
import io.jsonwebtoken.Jws;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    Environment environment;
    public int addition(int a, int b){
            return a+b;
    }

    public UserModel validateUserLogin(String email,String password)throws  Exception{
        UserModel user =  userRepo.getUserByEmailAndPassword(email,password).orElseThrow(()->new Exception("Please provide the username and password"));
        String token = getTOkenForEmail(user);
        updateToken(token,user.getId());//update token with value for successful login in the databse
        user.setToken(token);//update the the token in   the model.
        return  user;
    }
    public boolean logout(int user_id) throws  Exception{
        updateToken("",user_id);//update token is empty for logout
        return  true;
    }

    private  void updateToken(String token ,int userId){
        userRepo.updateTokenForUserId(token,userId);//update the value in the databse against the user.
    }

    private String  getTOkenForEmail(UserModel user) {
        Calendar c = Calendar.getInstance(); // starts with today's date and time
       // c.add(Calendar.DAY_OF_YEAR, 2);  // advances day by 2
            //c.add(Calendar.HOUR_OF_DAY, 10);
            c.add(Calendar.DAY_OF_YEAR,10);
       // c.add(Calendar.SECOND, 5);//set the time
        String jwtToken = Jwts.builder()
                .claim("email", user.getEmail())
                .setSubject(user.getName())
                .setId(""+user.getId())
                .setIssuedAt(new Date())
                .setExpiration(c.getTime())
               .signWith(SignatureAlgorithm.HS512, environment.getProperty("JWT_SECRET"))
                .compact();
        return jwtToken;
    }

    public boolean checkJWTToken(String token) throws  CustomException{
        Jwts.parser().setSigningKey(environment.getProperty("JWT_SECRET")).parseClaimsJws(token);
        //Jwts.parser().parseClaimsJws(token);
        return true;
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
                throw  new CustomException("user is not found");
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

    public boolean validateToken(String token,Integer userId) throws  Exception{
            UserModel user = listUser(userId);//get the user details by the userid
            if(user.getToken().equals(token)){
                return  true;
            }else{
                throw new CustomException("token mismatch");
            }
    }
    public  UserModel listUser(Integer userId) throws  Exception {
        Optional<UserModel> userModel = userRepo.findById(userId);//get the data bases on primary key
        //user is exist
        if(userModel.isPresent()){
            return userModel.get();//get the usermodel the optional's userModel.
        }else{
            throw  new CustomException("user is not found(list user)");
        }

    }
}
