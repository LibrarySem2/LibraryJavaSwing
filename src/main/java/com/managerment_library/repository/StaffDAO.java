package com.managerment_library.repository;

import com.managerment_library.entity.StaffEntity;
import com.managerment_library.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class StaffDAO {

    private Session session = null;
    private Transaction transaction = null;

    public List<StaffEntity> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<StaffEntity> result = session.createQuery("from StaffEntity", StaffEntity.class).getResultList();
        transaction.commit();
        return result;
    }

    // chức năng thêm nhân viên
    public StaffEntity saveStaff(StaffEntity staffEntity) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            Long id = (Long) session.save(staffEntity);
            staffEntity = session.find(StaffEntity.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return staffEntity;
    }

    // chức năng cập nhật nhân viên
    public StaffEntity updateStaff(StaffEntity staffEntity) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        StaffEntity staffEntityUpdate = session.load(StaffEntity.class, staffEntity.getId());
        staffEntityUpdate.setAddress(staffEntity.getAddress());
        staffEntityUpdate.setBirthday(staffEntity.getBirthday());
        staffEntityUpdate.setEmail(staffEntity.getEmail());
        staffEntityUpdate.setFullName(staffEntity.getFullName());
        staffEntityUpdate.setGender(staffEntity.getGender());
        staffEntityUpdate.setPhone(staffEntity.getPhone());
        staffEntityUpdate.setPosition(staffEntity.getPosition());
        session.update(staffEntityUpdate);
        transaction.commit();
        return staffEntity;
    }

    // chức năng xóa nhân viên
    public int delStaff(Long staffId) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        int result = session.createNativeQuery("DELETE FROM staff WHERE id = " + staffId).executeUpdate();
        transaction.commit();
        return result;
    }
}
