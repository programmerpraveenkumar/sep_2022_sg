package com.octsg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.junit.runner.RunWith;
import static org.springframework.test
        .web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserControllerTest.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mvc;
    public void getUser() throws Exception {
//
//        User user = new User();
//        user.setName("jadu");
//        user.setId(4);
//        when(userService.getUserByName("jadu")).thenReturn(user);

        mvc.perform(get("user")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("jadu"));

    }
}
