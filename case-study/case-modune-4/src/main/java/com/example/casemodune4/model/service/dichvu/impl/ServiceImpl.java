package com.example.casemodune4.model.service.dichvu.impl;

import com.example.casemodune4.model.entity.dichvu.ServiceEntity;
import com.example.casemodune4.model.respository.dichvu.IServiceRepository;
import com.example.casemodune4.model.service.dichvu.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ServiceImpl implements IService {
    @Autowired
    private IServiceRepository iServiceRepository;

    @Override
    public List<ServiceEntity> findAll() {
        return this.iServiceRepository.findAll();
    }

    @Override
    public void save(ServiceEntity service) {
        this.iServiceRepository.save(service);
    }

    @Override
    public Optional<ServiceEntity> findById(long id) {
        return this.iServiceRepository.findById(id);
    }

    @Override
    public void remove(long id) {
        this.iServiceRepository.findById(id);
    }

    @Override
    public void update(ServiceEntity service) {
        this.iServiceRepository.save(service);
    }

    @Override
    public Page<ServiceEntity> search(Pageable pageable, String name) {
        return this.iServiceRepository.findByNameContaining(pageable,name);
    }
}
