package com.example.thi.model.respository.product;

import com.example.thi.model.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdductRepository extends JpaRepository<Product,Long> {
}
