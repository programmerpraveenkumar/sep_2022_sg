package com.octsg.Service;


 import com.octsg.Repo.UserRepo;
 import com.octsg.Request.UserRequest;
 import com.octsg.model.UserModel;
 import com.octsg.services.UserService;

 import io.jsonwebtoken.Jwts;
 import io.jsonwebtoken.SignatureAlgorithm;
 import org.junit.Before;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.extension.ExtendWith;

 import org.mockito.InjectMocks;
 import org.mockito.Mock;
 import org.mockito.Mockito;
 import org.mockito.Spy;
 import org.mockito.junit.jupiter.MockitoExtension;


 import static org.junit.Assert.assertEquals;
 import static org.mockito.BDDMockito.given;
 import static org.mockito.Mockito.lenient;
 import static org.mockito.Mockito.when;

 import org.junit.jupiter.api.Test;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.core.env.Environment;
 import org.springframework.test.util.ReflectionTestUtils;

 import java.util.Calendar;
 import java.util.Date;
 import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    Environment environment;


    @InjectMocks
    private UserService userService;
    @Mock
    private UserRepo userRepo;

    private  UserModel userModel;
    @BeforeEach
    public void anyname(){
        userModel = UserModel.builder().id(1).name("name").mobile("4545").email("test@gmail.com").token("some token").build();
    }
    @Before
    public void before() {


    }

    @Test
    void additionTest(){
            int res = userService.addition(10,15);
            assertEquals(25,res);
    }

    @Test
    void validateUserLoginTest() throws  Exception{

        //UserModel userModel = UserModel.builder().id(1).name("name").mobile("4545").email("test@gmail.com").build();
      Mockito.when(environment.getProperty("JWT_SECRET")).thenReturn("SECRET");
        UserRequest req = new UserRequest();
        req.setPassword("4545");
        req.setEmail("test@gmail.com");
        when(userRepo.getUserByEmailAndPassword(req.getEmail(),req.getPassword())).thenReturn(Optional.of(userModel));
        lenient().when( userRepo.updateTokenForUserId(userModel.getToken(),userModel.getId())).thenReturn(1);
        UserModel afterlogin = userService.validateUserLogin(req.getEmail(),req.getPassword());
        assertEquals(afterlogin.getEmail(),req.getEmail());
    }

    @Test
    void createUserTest() throws  Exception{
       // UserModel userModel = UserModel.builder().id(1).name("name").mobile("45454").email("test@gmail.com").password("4545").build();
        UserRequest req = new UserRequest();
        req.setPassword("4545");
        req.setEmail("test@gmail.com");
        req.setName("test");
        req.setMobile("45454");
        when(userRepo.getUserByEmail(userModel.getEmail())).thenReturn(Optional.empty());
       // lenient(). when(userRepo.save(userModel)).thenReturn(userModel);
        lenient().when(userRepo.save(userModel)).thenReturn(userModel);
        boolean status = userService.createUser(req);
        assertEquals(status,true);
    }




}
