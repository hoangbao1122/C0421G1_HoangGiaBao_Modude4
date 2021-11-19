package com.example.thi.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGeneric<T> {
    Page<T> findAll(Pageable pageable);

    void save(T t);

    Optional<T> findById(long id);

    void remove(long id);

    void update(T t);

    Page<T> search(Pageable pageable,String name);
}
