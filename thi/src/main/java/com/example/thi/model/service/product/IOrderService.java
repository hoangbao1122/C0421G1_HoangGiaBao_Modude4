package com.example.thi.model.service.product;

import com.example.thi.model.entity.product.OrderEntity;

import java.util.List;

public interface IOrderService {
    List<OrderEntity>findAll();
}
