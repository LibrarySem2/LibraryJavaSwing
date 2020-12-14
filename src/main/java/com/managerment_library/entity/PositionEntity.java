/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Admin
 */
@Entity
@Table (name = "positions")
public class PositionEntity implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Long id;
    
    @Column (name = "position",nullable = false)
    private String posision;
    
    @Column (name = "salary")
    private String salary;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

 /*   public List<StaffEntity> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<StaffEntity> staffs) {
        this.staffs = staffs;
    } */
    
    
    public String getPosision() {
        return posision;
    }

    public void setPosision(String posision) {
        this.posision = posision;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
