package com.jshans.springbootjpaexample.model.user;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private UserName name;

    @Embedded
    private UserPassword password;

    public User(UserName name, UserPassword password) {
        this.name = name;
        this.password = password;
    }
}
