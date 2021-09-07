package com.example.book.model.service.Impl;

import com.example.book.model.bean.Book;
import com.example.book.model.repository.IBookRepository;
import com.example.book.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl  implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;


    @Override
    public List<Book> findAll() {
        return this.iBookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        this.iBookRepository.save(book);
    }

    @Override
    public Book findById(int id) {
        return this.iBookRepository.findById(id).get();
    }

    @Override
    public void update(Book book) {
        this.iBookRepository.save(book);
    }
}
