package com.octsg.Repo;

import com.octsg.model.UserModel;
import java.util.List;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {
    @Query("select user from UserModel user where email = ?1 and password=?2")
    Optional<UserModel> getUserByEmailAndPassword(String email, String password);
/*
DML error
 */
    @Modifying
    @Transactional
    @Query("update  UserModel  set token = ?1 where id = ?2")
    Integer updateTokenForUserId(String token, Integer userId);

    @Query("select user from UserModel user where email = ?1")
    Optional<UserModel> getUserByEmail(String email);
//    @Query("select count(user) from UserModel user ")
//   Integer getUsercount();
    @Query("select user from UserModel user ")
    List<UserModel> getAllUser();
    @Query("select user from UserModel  user JOIN user.cityModel city  where city.id=?1")
    List<UserModel> getUserByCity(int cityid);

}
