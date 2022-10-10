package com.example.cau1.repository.authReponsitory;


import com.example.cau1.entity.authEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
