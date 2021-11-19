package com.example.thi.model.respository.product;

import com.example.thi.model.entity.product.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<OrderEntity,Long> {
}
