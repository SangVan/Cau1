package com.example.cau1.service;


import com.example.cau1.config.UserPrincipal;
import com.example.cau1.entity.authEntity.Product;

import java.util.Collection;

public interface ProductService {
    public abstract void createProduct(Product product);


    Collection<Product> getProducts();
}
