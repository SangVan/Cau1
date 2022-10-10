package com.example.cau1.service;

import com.example.cau1.config.UserPrincipal;
import com.example.cau1.entity.authEntity.Product;
import com.example.cau1.entity.authEntity.User;
import com.example.cau1.repository.authReponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProductServicelmpl implements ProductService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Product createUser(Product product) {
        return null;
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        return null;
    }
}
