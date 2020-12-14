/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.entity;

import javax.persistence.*;

/**
 *
 * @author Admin
 */
@Entity
@Table (name = "bookrentaldetail")
public class BookRentalDetailEntity {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "id")
    private Long id;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "bookrental_id")
    private BookRentalEntity bookRentalEntity;
    
    @OneToOne
    @JoinColumn (name = "book_id")
    private BooksEntity booksEntity;
    
    @Column (name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BookRentalEntity getBookRentalEntity() {
        return bookRentalEntity;
    }

    public void setBookRentalEntity(BookRentalEntity bookRentalEntity) {
        this.bookRentalEntity = bookRentalEntity;
    }

    public BooksEntity getBooksEntity() {
        return booksEntity;
    }

    public void setBooksEntity(BooksEntity booksEntity) {
        this.booksEntity = booksEntity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
