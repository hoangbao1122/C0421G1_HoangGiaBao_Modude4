package com.example.thi.model.service.product.Impl;

import com.example.thi.model.entity.product.OrderEntity;
import com.example.thi.model.respository.product.IOrderRepository;
import com.example.thi.model.service.product.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderRepository iOrderRepository;
    @Override
    public List<OrderEntity> findAll() {
        return this.iOrderRepository.findAll();
    }
}
