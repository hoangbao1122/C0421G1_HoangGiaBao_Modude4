package com.example.casemodune4.model.service.employee.impl;

import com.example.casemodune4.model.entity.user.User;
import com.example.casemodune4.model.respository.emp.IUserRespository;
import com.example.casemodune4.model.service.employee.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRespository iUserRespository;
    @Override
    public List<User> findAll() {
        return this.iUserRespository.findAll();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public Page<User> search(Pageable pageable, String name) {
        return null;
    }
}
