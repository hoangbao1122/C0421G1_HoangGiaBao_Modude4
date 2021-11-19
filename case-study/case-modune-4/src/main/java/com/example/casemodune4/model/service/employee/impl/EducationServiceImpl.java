package com.example.casemodune4.model.service.employee.impl;

import com.example.casemodune4.model.entity.emp.EducationDegree;
import com.example.casemodune4.model.respository.emp.IEducationDegreeRespository;
import com.example.casemodune4.model.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EducationServiceImpl implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRespository iEducationDegree;
    @Override
    public List<EducationDegree> findAll() {
        return this.iEducationDegree.findAll();
    }

    @Override
    public void save(EducationDegree educationDegree) {
        this.iEducationDegree.save(educationDegree);
    }

    @Override
    public Optional<EducationDegree> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void update(EducationDegree educationDegree) {

    }

    @Override
    public Page<EducationDegree> search(Pageable pageable, String name) {
        return null;
    }
}
