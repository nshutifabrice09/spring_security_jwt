package com.example.demo.exception;

import com.example.demo.user.User;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String id){
        super
                ("Couldn't find user with id "+id);
    }
}
