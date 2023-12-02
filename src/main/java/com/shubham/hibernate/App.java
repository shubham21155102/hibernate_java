package com.shubham.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Song.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        System.out.println("Hello World!");
        Song song = new Song();
        song.setId(2);
        song.setSongName("Damadam Mast Kalandar");
        song.setSingerName("Abida Parveen");
        session.beginTransaction();
        session.persist(song);
        session.getTransaction().commit();
        System.out.println("Done!");
    }
}
