package com.octsg.Configuration;

import com.octsg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    UserService userService;
    //before goes to the controller
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try{
            String current_url = request.getRequestURL().toString();
            System.out.println("current url "+current_url+" method is "+request.getMethod());
        return true;
            //            if(request.getMethod().equals("OPTIONS")){
//                return true;
//            }
//
//            if(current_url.endsWith("userLogin") || current_url.contains("readImage")){
//                System.out.println("excluding the url "+current_url);
//                return  true;//for login method no need to check the token and user id
//            }
//
//
//
//            String token = request.getHeader("token");//access the toekn from the request
//            String userId = request.getHeader("userId");//access the userId from the request
//            System.out.println(token+" "+userId);
//            if(token == null || token.equals("")){
//                System.out.println("token is null");
//                throw new CustomException("please send the token");
//            }
//            if(userId == null ||userId.equals("")){
//                System.out.println("userId is null");
//                throw new CustomException("please send the userId");
//            }
//            Integer int_user_id = Integer.parseInt(userId);//conver the string to int;
//            userService.checkJWTToken(token);
//            ////failure will throw the exception.
//            if(userService.validateToken(token,int_user_id)){
//                return true;//goes to controller
//            }else {
//                return false;//will stop here.
//            }

        }catch (Exception e){
            throw new CustomException(e.getMessage());
        }


    }

    //before sendign the response.after the completion of controller
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("this is post handle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }


    //after sending the response.
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        System.out.println("this is afterCompletion");
    }
}
