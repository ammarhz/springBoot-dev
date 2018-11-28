package com.ammar.controller;

import com.ammar.model.UserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/user")
public class UserController {

    // Crate New User
    @PostMapping(value = "/register")
    public String register(@RequestBody UserModel appUser) {

        return "HELLO " + appUser.getFirstName();
    }
}
