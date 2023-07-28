package com.example.flexbookback.controller;

import com.example.flexbookback.model.Posts;
import com.example.flexbookback.model.User;
import com.example.flexbookback.service.PostService;
import com.example.flexbookback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
//@CrossOrigin( maxAge = 3600)
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/login")
    public int findUser(@RequestParam String username, @RequestParam String password){

        return  userService.getLogin(username,password).getUser_id();
    }

}
