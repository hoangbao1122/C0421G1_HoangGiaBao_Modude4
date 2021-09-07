package com.example.book.model.repository;

import com.example.book.model.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
