package com.example.cau1.entity.authEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Product")
@Getter
@Setter
public class Product implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long ProId;

    private String Name;

    private String Price;

    public Product() {
    }

    public Product(Long proId, String name, String price) {
        ProId = proId;
        Name = name;
        Price = price;
    }

    public Long getProId() {
        return ProId;
    }

    public void setProId(Long proId) {
        ProId = proId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

//    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)

//    private Set<Role> roles = new HashSet<>();

}
