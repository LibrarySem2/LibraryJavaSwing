/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.repository;

import com.managerment_library.entity.PositionEntity;
import com.managerment_library.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Admin
 */
public class PositionDAO {

    private Session session = null;

    public List<PositionEntity> getALL() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<PositionEntity> result = session.createQuery("from PositionEntity", PositionEntity.class).getResultList();
        return result;

    }

    public PositionEntity findById(Long id) {
       // session = HibernateUtil.getSessionFactory().openSession();
        session = HibernateUtil.getSessionFactory().openSession();
        PositionEntity positionEntity = session.find(PositionEntity.class, id);
        return positionEntity;
    }

    public int delStaff(Long positionId) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int result = session.createNativeQuery("DELETE FROM positions WHERE id = " + positionId).executeUpdate();
        transaction.commit();
        return result;
    }
}
