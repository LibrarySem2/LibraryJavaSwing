/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.utils;

import com.managerment_library.entity.*;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Admin
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/library_swing?useSSL=false");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "saker0905971230");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "none");

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(PositionEntity.class);
                configuration.addAnnotatedClass(StaffEntity.class);
                configuration.addAnnotatedClass(UserEntity.class);
                configuration.addAnnotatedClass(RoleEntity.class);
                configuration.addAnnotatedClass(BooksEntity.class);
                configuration.addAnnotatedClass(CatgoryEntity.class);
                configuration.addAnnotatedClass(MemberCardTypeEntity.class);
                configuration.addAnnotatedClass(MemberCardEntity.class);
                configuration.addAnnotatedClass(OwnerInforEntity.class);
                configuration.addAnnotatedClass(BookRentalEntity.class);
                configuration.addAnnotatedClass(BookRentalDetailEntity.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                System.out.println("Hibernate Java Config serviceRegistry created");
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                return sessionFactory;

            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
