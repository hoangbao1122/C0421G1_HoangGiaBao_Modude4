package com.example.book.model.repository;

import com.example.book.model.bean.BorrowBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowBookRepository extends JpaRepository<BorrowBook,Integer> {
}
