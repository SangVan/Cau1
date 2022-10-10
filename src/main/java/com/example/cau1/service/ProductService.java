package com.example.cau1.service;


import com.example.cau1.config.UserPrincipal;
import com.example.cau1.entity.authEntity.Product;

public interface ProductService {
    Product createUser(Product product);

    UserPrincipal findByUsername(String username);
}
