package com.example.netboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.netboot.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
