/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.repository;

import com.managerment_library.entity.BooksEntity;
import com.managerment_library.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class BooksDAO {
    
    private Session session = null;
    private Transaction transaction = null;

    public List<BooksEntity> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<BooksEntity> result = session.createQuery("from BooksEntity", BooksEntity.class).getResultList();
        transaction.commit();
        return result;
    }
    
    public List<BooksEntity> resultSearch(String name, String author, Long catgoryId) {
        StringBuilder sql = buildSqlSearch(name, author, catgoryId);
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<BooksEntity> result = session.createNativeQuery(sql.toString(), BooksEntity.class).getResultList();
        transaction.commit();
        return result;
    }

    private StringBuilder buildSqlSearch(String name, String author, Long catgoryId) {
        StringBuilder builder = new StringBuilder("SELECT * FROM books b");
        if (catgoryId != -1L) {
            builder.append(" JOIN catgory_book cb on b.id = cb.book_id");
        }
        builder.append(" WHERE b.name Like '%").append(name).append("%'");
        builder.append(" AND b.author Like '%").append(author).append("%'");
        if (catgoryId != -1L) {
            builder.append(" AND cb.catgory_id = ").append(catgoryId);
        }
        return builder;
    }
    
    
}
