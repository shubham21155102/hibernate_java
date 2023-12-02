package com.shubham.utils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.shubham.entity.Song;
public class HibernateUtils {
    private static SessionFactory factory = null;

    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            cfg.addAnnotatedClass(Song.class);
            // SessionFactory factory = cfg.buildSessionFactory();
            factory = cfg.buildSessionFactory();
            return factory;
        }
        return factory;
    }
}
