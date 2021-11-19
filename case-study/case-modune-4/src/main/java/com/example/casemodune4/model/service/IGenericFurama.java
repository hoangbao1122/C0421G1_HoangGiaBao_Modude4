package com.example.casemodune4.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGenericFurama<T> {
    List<T> findAll();

    void save(T t);

    Optional<T> findById(long id);

    void remove(long id);

    void update(T t);

    Page<T> search(Pageable pageable,String name);
}
