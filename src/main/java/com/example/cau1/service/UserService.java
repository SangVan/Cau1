package com.example.cau1.service;


import com.example.cau1.config.UserPrincipal;
import com.example.cau1.entity.authEntity.User;
public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
