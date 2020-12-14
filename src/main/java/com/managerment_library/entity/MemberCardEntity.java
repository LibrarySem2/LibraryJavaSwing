/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.entity;

import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "membercard")
public class MemberCardEntity {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY) 
    @JoinColumn(name = "card_type")
    private MemberCardTypeEntity cardType;
    
    @Column(name = "createday")
    private Date createDay;
    
    @Column(name = "expirationday")
    private Date expirationDate;
    
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private OwnerInforEntity inforEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberCardTypeEntity getCardType() {
        return cardType;
    }

    public void setCardType(MemberCardTypeEntity cardType) {
        this.cardType = cardType;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public OwnerInforEntity getInforEntity() {
        return inforEntity;
    }

    public void setInforEntity(OwnerInforEntity inforEntity) {
        this.inforEntity = inforEntity;
    }
    
    
    
}
