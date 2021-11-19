package com.example.casemodune4.model.service.dichvu.impl;

import com.example.casemodune4.model.entity.dichvu.RentType;
import com.example.casemodune4.model.respository.dichvu.IRendTypeRepository;
import com.example.casemodune4.model.service.dichvu.IRendTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentTypeServiceImpl implements IRendTypeService {
    @Autowired
    private IRendTypeRepository iRendTypeRepository;

    @Override
    public List<RentType> findAll() {
        return this.iRendTypeRepository.findAll();
    }

    @Override
    public void save(RentType rentType) {
        this.iRendTypeRepository.save(rentType);
    }

    @Override
    public Optional<RentType> findById(long id) {
        return this.iRendTypeRepository.findById(id);
    }

    @Override
    public void remove(long id) {
        this.iRendTypeRepository.deleteById(id);
    }

    @Override
    public void update(RentType rentType) {

    }

    @Override
    public Page<RentType> search(Pageable pageable, String name) {
        return null;
    }


}
