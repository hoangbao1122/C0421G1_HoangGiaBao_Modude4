package com.example.book.model.service.Impl;

import com.example.book.model.bean.BorrowBook;
import com.example.book.model.repository.IBorrowBookRepository;
import com.example.book.model.service.IBorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowBookServiceImpl implements IBorrowBookService {
    @Autowired
    private IBorrowBookRepository iBorrowBookRepository;

    @Override
    public List<BorrowBook> findAll() {
        return this.iBorrowBookRepository.findAll();
    }

    @Override
    public void save(BorrowBook borrowBook) {
        this.iBorrowBookRepository.save(borrowBook);
    }

    @Override
    public BorrowBook findById(int id) {
        return this.iBorrowBookRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        this.iBorrowBookRepository.deleteById(id);
    }
}
