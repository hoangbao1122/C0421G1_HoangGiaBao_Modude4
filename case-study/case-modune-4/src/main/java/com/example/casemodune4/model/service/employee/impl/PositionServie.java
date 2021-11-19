package com.example.casemodune4.model.service.employee.impl;

import com.example.casemodune4.model.entity.emp.Position;
import com.example.casemodune4.model.respository.emp.IPositionRepository;
import com.example.casemodune4.model.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PositionServie implements IPositionService {
    @Autowired
    private IPositionRepository iPositionRepository;
    @Override
    public List<Position> findAll() {
        return this.iPositionRepository.findAll();
    }

    @Override
    public void save(Position position) {

    }

    @Override
    public Optional<Position> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void update(Position position) {

    }

    @Override
    public Page<Position> search(Pageable pageable, String name) {
        return null;
    }
}
