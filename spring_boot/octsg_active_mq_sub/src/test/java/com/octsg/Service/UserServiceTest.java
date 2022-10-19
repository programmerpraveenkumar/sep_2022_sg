package com.octsg.Service;

 import com.octsg.Repo.UserRepo;
 import com.octsg.Request.UserRequest;
 import com.octsg.model.UserModel;
 import com.octsg.services.UserService;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.DisplayNameGeneration;
 import org.junit.jupiter.api.DisplayNameGenerator;
 import org.junit.jupiter.api.extension.ExtendWith;
 import org.junit.runner.RunWith;
 import org.mockito.InjectMocks;
 import org.mockito.Mock;
 import org.mockito.junit.jupiter.MockitoExtension;
 import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

 import static org.junit.Assert.assertEquals;
 import static org.junit.Assert.assertTrue;
 import static org.mockito.Mockito.*;
 import static org.assertj.core.api.Assertions.assertThat;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.extension.ExtendWith;

 import static org.mockito.ArgumentMatchers.any;
 import static org.mockito.BDDMockito.given;
 import static org.mockito.BDDMockito.willDoNothing;
 import static org.mockito.Mockito.*;

 import org.mockito.InjectMocks;
 import org.mockito.Mock;
 import org.mockito.junit.jupiter.MockitoExtension;

 import java.util.Arrays;
 import java.util.Collections;
 import java.util.List;
 import java.util.Optional;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepo userRepo;
    private  UserModel userModel;
    @BeforeEach
    public void setup(){
        //employeeRepository = Mockito.mock(EmployeeRepository.class);
        //employeeService = new EmployeeServiceImpl(employeeRepository);
        userModel = UserModel.builder()
                .id(1)
                .email("test@gmail.com")
                .name("test")
                .mobile("123456")
                .build();
    }

    @Test
    void additionTest(){
            int res = userService.addition(10,15);
            assertEquals(25,res);
    }

    @Test
    void listUserTest() throws Exception {
        UserModel userModel1 = UserModel.builder()
                .id(2)
                .email("test1@gmail.com")
                .name("test1")
                .mobile("1234561")
                .build();
        given(userRepo.findAll()).willReturn(Arrays.asList(userModel1,userModel));
        List<UserModel> userList = userService.listUser();
        assertThat(userList).isNotNull();
        assertThat(userList.size()).isEqualTo(2);

    }
    @Test
    void listUserIdTest() throws Exception {

        given(userRepo.findById(1)).willReturn(Optional.of(userModel));
        UserModel userList = userService.listUser(1);
        assertThat(userList).isNotNull();
        assertThat(userList.getName()).isEqualTo("test");
        assertThat(userList.getEmail()).isEqualTo("test@gmail.com");
        assertThat(userList.getMobile()).isEqualTo("123456");
    }
//    @Test
//    void createUserTest() throws  Exception{
//        when(userRepo.getUserByEmail(userModel.getEmail())).thenReturn(Optional.empty());
//        when(userRepo.save(any(UserModel.class))).thenReturn(userModel);
//        UserRequest userRequest = new UserRequest();
//        userRequest.setEmail(userModel.getEmail());
//        userRequest.setName(userModel.getName());
//        userRequest.setPassword(userModel.getPassword());
//        userRequest.setMobile(userModel.getMobile());
//        boolean status = userService.createUser(userRequest);
//
//        //assertTrue(status);
  //  }

}
