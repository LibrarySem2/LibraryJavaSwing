/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.repository;

import com.managerment_library.entity.BooksEntity;
import com.managerment_library.entity.CatgoryEntity;
import com.managerment_library.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class CatgoryDAO {
    private Session session = null;
    private Transaction transaction = null;

    public List<CatgoryEntity> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<CatgoryEntity> result = session.createQuery("from CatgoryEntity", CatgoryEntity.class).getResultList();
        transaction.commit();
        return result;
    }
}
