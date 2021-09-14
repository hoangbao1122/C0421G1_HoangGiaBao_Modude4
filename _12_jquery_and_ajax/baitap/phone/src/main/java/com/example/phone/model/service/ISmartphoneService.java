package com.example.phone.model.service;


import com.example.phone.model.entity.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone phone);

    void remove(long id);
}
