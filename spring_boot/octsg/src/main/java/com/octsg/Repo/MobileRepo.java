package com.octsg.Repo;

import com.octsg.model.MobileModel;
import com.octsg.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface MobileRepo extends JpaRepository<MobileModel,Integer> {

/*
DML error
 */
    @Modifying
    @Transactional
    @Query("update  MobileModel  set mobile_no = ?1 where id = ?2 and user_id=?3")
    Integer updaetMobileByidAndUserId(Integer mobile_no, Integer id,Integer userId);


}
