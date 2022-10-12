package com.octsg.Repo;

import com.octsg.model.UserModel;
import java.util.List;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {
    @Query("select user from UserModel user where email = ?1 and password=?2")
    Optional<UserModel> getUserByEmailAndPassword(String email, String password);

    @Query("select user from UserModel user where email = ?1")
    Optional<UserModel> getUserByEmail(String email);
//    @Query("select count(user) from UserModel user ")
//   Integer getUsercount();
    @Query("select user from UserModel user ")
    List<UserModel> getAllUser();
}
