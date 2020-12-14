/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "bookrental")
public class BookRentalEntity {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "membercard_id")
    private MemberCardEntity cardEntity;
    
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "bookRentalEntity")
    private List<BookRentalDetailEntity> bookrentals;

    public List<BookRentalDetailEntity> getBookrentals() {
        return bookrentals;
    }

    public void setBookrentals(List<BookRentalDetailEntity> bookrentals) {
        this.bookrentals = bookrentals;
    }
    
    
    
    @Column (name = "rentday")
    private Date rentDay;
    
    @Column(name = "endđay")
    private Date endDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberCardEntity getCardEntity() {
        return cardEntity;
    }

    public void setCardEntity(MemberCardEntity cardEntity) {
        this.cardEntity = cardEntity;
    }

    public Date getRentDay() {
        return rentDay;
    }

    public void setRentDay(Date rentDay) {
        this.rentDay = rentDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }
    
    
}
