package com.example.cau1.controller;

import com.example.cau1.config.JwtUtil;
import com.example.cau1.config.UserPrincipal;
import com.example.cau1.entity.authEntity.Product;
import com.example.cau1.entity.authEntity.Token;
import com.example.cau1.entity.authEntity.User;
import com.example.cau1.service.ProductService;
import com.example.cau1.service.TokenService;
import com.example.cau1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductServiceController  {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }


}
