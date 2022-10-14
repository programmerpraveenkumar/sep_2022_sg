package com.octsg.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import javax.persistence.*;
/*
CRUD
create,read,delete ,update
 */
//ORM->Object relation mapping

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String email;
    String mobile;
    String token;
    @JsonIgnore//will not share as response.but can be used for setting the vlaue.
    String password;
    String profile_pic;




}
