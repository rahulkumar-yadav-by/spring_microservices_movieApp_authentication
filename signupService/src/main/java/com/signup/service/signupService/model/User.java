package com.signup.service.signupService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity //JPA
@Table(name="users")
public class User{

    @Id
    @GeneratedValue
    private int id;
    private String name;

//    public User(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//    private String email;
//    private String password;

}