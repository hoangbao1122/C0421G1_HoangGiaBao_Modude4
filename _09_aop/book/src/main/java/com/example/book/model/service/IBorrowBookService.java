package com.example.book.model.service;

import com.example.book.model.bean.BorrowBook;

import java.util.List;

public interface IBorrowBookService {
    List<BorrowBook>findAll();
    void save(BorrowBook borrowBook);
    BorrowBook findById(int id);
    void delete(int id);
}
