/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.repository;

import com.managerment_library.entity.RoleEntity;
import com.managerment_library.entity.UserEntity;
import com.managerment_library.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author Admin
 */
public class UserDAO {
    public String isExistUser(String userName, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<UserEntity> result = session.createNativeQuery("Select * From users WHERE username = '"
                        +userName+"' AND password = '"+password+"'",UserEntity.class).getResultList();        
        if (result != null) {
            List<RoleEntity> roleEntitys = result.get(0).getRoles();
            String code = roleEntitys.get(0).getCode();
            return code;
        }
        return null;
    } 
}
