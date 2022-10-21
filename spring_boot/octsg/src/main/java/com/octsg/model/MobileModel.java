package com.octsg.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "mobile")
public class MobileModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String mobile_no;
    String network;
    int user_id;

}
