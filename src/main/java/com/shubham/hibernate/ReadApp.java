package com.shubham.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shubham.entity.Song;
import com.shubham.utils.HibernateUtils;

public class ReadApp {
    public static void main(String[] args) {
        // Configuration cfg = new Configuration();
        // cfg.configure();
        // cfg.addAnnotatedClass(Song.class);
        // SessionFactory factory = cfg.buildSessionFactory();
        SessionFactory factory =HibernateUtils.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Song song=session.get(Song.class, 1);
        System.out.println(song.toString());
        session.getTransaction().commit();
        // try {
        //     Song song=session.load(Song.class, 1);
        //     System.out.println(song.getSongName() + "----> " + song.getSingerName())
        //     ;
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // session.getTransaction().commit();
        System.out.println("Done!");
    }
}
