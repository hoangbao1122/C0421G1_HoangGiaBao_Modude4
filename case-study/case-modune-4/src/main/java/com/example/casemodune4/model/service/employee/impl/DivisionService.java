package com.example.casemodune4.model.service.employee.impl;

import com.example.casemodune4.model.entity.emp.Division;
import com.example.casemodune4.model.respository.emp.IDivisionRespository;
import com.example.casemodune4.model.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRespository iDivisionRespository;

    @Override
    public List<Division> findAll() {
        return this.iDivisionRespository.findAll();
    }

    @Override
    public void save(Division division) {
        this.iDivisionRespository.save(division);
    }

    @Override
    public Optional<Division> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void update(Division division) {

    }

    @Override
    public Page<Division> search(Pageable pageable, String name) {
        return null;
    }
}
