package com.example.casemodune4.model.service.dichvu.impl;

import com.example.casemodune4.model.entity.dichvu.ServiceType;
import com.example.casemodune4.model.respository.dichvu.IServiceRepository;
import com.example.casemodune4.model.respository.dichvu.IServiceTypeRepository;
import com.example.casemodune4.model.service.dichvu.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTypeImpl implements ITypeService {
    @Autowired
    private IServiceTypeRepository iServiceTypeRepository;


    @Override
    public List<ServiceType> findAll() {
        return this.iServiceTypeRepository.findAll();
    }

    @Override
    public void save(ServiceType serviceType) {
    this.iServiceTypeRepository.save(serviceType);
    }

    @Override
    public Optional<ServiceType> findById(long id) {
        return this.iServiceTypeRepository.findById(id);
    }

    @Override
    public void remove(long id) {
    this.iServiceTypeRepository.deleteById(id);
    }

    @Override
    public void update(ServiceType serviceType) {
        this.iServiceTypeRepository.save(serviceType);
    }

    @Override
    public Page<ServiceType> search(Pageable pageable, String name) {
        return null;
    }
}
