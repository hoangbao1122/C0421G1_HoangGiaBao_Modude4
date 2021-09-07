package com.example.book.model.bean;



import javax.persistence.*;


@Entity
public class BorrowBook {
    @Id
    private Integer id;

    public BorrowBook(){

    }

    public BorrowBook(Integer id, Book book) {
        this.id = id;
        this.book = book;
    }

    @ManyToOne(targetEntity = Book.class)
    @JoinColumn(name = "book_id",referencedColumnName = "id")
    private Book book;

    public Book getBook() {
        return book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
