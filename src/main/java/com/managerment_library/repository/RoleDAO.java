/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.repository;

import com.managerment_library.entity.RoleEntity;
import com.managerment_library.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Admin
 */
public class RoleDAO {
    
    public void saveRole(RoleEntity roleEntity) {
        Transaction transaction = null;
        try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(roleEntity);
        transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public List<RoleEntity> getAll() {
        List<RoleEntity> result = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        result = session.createQuery("from RoleEntity", RoleEntity.class).list();
        return result;
    } 
}
