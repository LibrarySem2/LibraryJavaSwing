/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Admin
 */

@Entity
@Table (name = "cagorybook")
public class CatgoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Long id;
    
    @Column(name = "name")
    private String catgory;
    
    @ManyToMany(mappedBy = "catgoryEntitys",cascade = CascadeType.ALL)
    List<BooksEntity> booksEntitys = new ArrayList<>();

    public List<BooksEntity> getBooksEntitys() {
        return booksEntitys;
    }

    public void setBooksEntitys(List<BooksEntity> booksEntitys) {
        this.booksEntitys = booksEntitys;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatgory() {
        return catgory;
    }

    public void setCatgory(String catgory) {
        this.catgory = catgory;
    }
    
}
