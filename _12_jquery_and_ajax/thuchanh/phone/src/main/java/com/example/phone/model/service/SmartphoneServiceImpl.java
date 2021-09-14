package com.example.phone.model.service;

import com.example.phone.model.entity.Smartphone;
import com.example.phone.model.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartphoneServiceImpl implements ISmartphoneService {
    @Autowired
    private ISmartphoneRepository iPhoneReposritory;
    @Override
    public Iterable<Smartphone> findAll() {
        return this.iPhoneReposritory.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return this.iPhoneReposritory.findById(id);
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return this.iPhoneReposritory.save(phone);
    }

    @Override
    public void remove(long id) {
        this.iPhoneReposritory.deleteById(id);
    }
}
