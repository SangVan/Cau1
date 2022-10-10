package com.example.cau1.repository.authReponsitory;


import com.example.cau1.entity.authEntity.Product;
import com.example.cau1.entity.authEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProduct(String product);
}
