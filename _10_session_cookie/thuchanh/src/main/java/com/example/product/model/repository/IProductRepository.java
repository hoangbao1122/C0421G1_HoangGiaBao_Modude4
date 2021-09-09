package com.example.product.model.repository;

import com.example.demo.model.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
