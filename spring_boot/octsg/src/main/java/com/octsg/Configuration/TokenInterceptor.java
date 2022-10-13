package com.octsg.Configuration;

import com.octsg.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    UserService userService;
    //before goes to the contoller
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String current_url = request.getRequestURL().toString();
        System.out.println("current url "+current_url);
        if(current_url.endsWith("userLogin")){
            System.out.println("excluding the url "+current_url);
            return  true;//for login method no need to check the token and user id
        }
        String token = request.getHeader("token");//access the toekn from the request
        String userId = request.getHeader("userId");//access the userId from the request
        Integer int_user_id = Integer.parseInt(userId);//conver the string to int;
        if(token.equals("")){
            throw new Exception("please send the token");
        }
        if(userId.equals("")){
            throw new Exception("please send the userId");
        }
        ////failure will throw the exception.
        if(userService.validateToken(token,int_user_id)){
            return true;//goes to controller
        }else {
            return false;//will stop here.
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
