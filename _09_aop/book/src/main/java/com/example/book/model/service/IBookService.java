package com.example.book.model.service;

import com.example.book.model.bean.Book;

import java.util.List;

public interface IBookService {
    List<Book>findAll();
    void save(Book book);
    Book findById(int id);
    void update(Book book);
}
