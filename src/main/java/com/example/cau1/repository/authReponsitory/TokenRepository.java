package com.example.cau1.repository.authReponsitory;


import com.example.cau1.entity.authEntity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);
}
