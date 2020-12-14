/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Admin
 */
@Entity
@Table (name = "books")
public class BooksEntity {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "author")
    private String author;
    
    @Column(name = "amount")
    private int amount;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "catgory_book", joinColumns = @JoinColumn(name = "book_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "catgory_id", nullable = false))
    private List<CatgoryEntity> catgoryEntitys = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<CatgoryEntity> getCatgoryEntity() {
        return catgoryEntitys;
    }

    public void setCatgoryEntity(List<CatgoryEntity> catgoryEntitys) {
        this.catgoryEntitys = catgoryEntitys;
    }
    
}
