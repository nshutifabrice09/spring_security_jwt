package com.example.demo.exception;

public class UsernameNotFoundException extends RuntimeException{

    public UsernameNotFoundException(String id){
        super
                ("Couldn't find user with id "+id);
    }
}
