package com.example.flexbookback.service;

import com.example.flexbookback.model.User;
import com.example.flexbookback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User getLogin(String username, String password){
        return userRepository.findUserByUsernameAndPassword(username,password);
    }
}
