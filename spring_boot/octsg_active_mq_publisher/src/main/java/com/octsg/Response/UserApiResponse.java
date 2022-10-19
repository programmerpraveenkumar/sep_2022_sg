package com.octsg.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter
@Setter
public class UserApiResponse {
    String page;
    String per_page;
    ArrayList<HashMap<String,String>> data;
    //ArrayList<UserData> data;

}
@Getter
@Setter
class UserData{
    Integer id;
    String email;
    String first_name;
    String last_name;

}
