package com.example.cau1.service;

import com.example.cau1.entity.authEntity.Token;
public interface TokenService {

    Token createToken(Token token);

    Token findByToken(String token);
}
