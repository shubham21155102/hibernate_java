package com.shubham.utils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shubham.entity.Song;
public class HibernateUtils {
    public static SessionFactory getSessionFactory(){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Song.class);
        SessionFactory factory = cfg.buildSessionFactory();
        return factory;
    }
}
