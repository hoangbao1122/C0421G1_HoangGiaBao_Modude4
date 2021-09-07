package com.example.book.model.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameBook;
    private int quantity;
    @OneToMany(mappedBy = "book")
    private Set<BorrowBook> borrowBookSet;
    public Book(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<BorrowBook> getBorrowBookSet() {
        return borrowBookSet;
    }

    public void setBorrowBookSet(Set<BorrowBook> borrowBookSet) {
        this.borrowBookSet = borrowBookSet;
    }
}
