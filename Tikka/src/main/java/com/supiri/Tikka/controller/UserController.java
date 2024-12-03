package com.supiri.Tikka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping
    public void User(int organizerID, String organizerName, String username, String password, String gmail){
        
    }
}
