package com.shubham.hibernate;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shubham.entity.Song;
import com.shubham.utils.HibernateUtils;
public class App {
    public static void main(String[] args) {
        // Configuration cfg = new Configuration();
        // cfg.configure("hibernate.cfg.xml");
        // cfg.addAnnotatedClass(Song.class);
      
        SessionFactory factory =HibernateUtils.getSessionFactory();
        Session session = factory.openSession();
        System.out.println("Hello World!");
        Song song = new Song();
        // song.setId(1);
        song.setSongName("Damadam Mast Kalandar");
        song.setSingerName("Abida Parveen");
        String songName = song.getSongName();
        String singerName = song.getSingerName();
        System.out.println(songName + "----> " + singerName);
        session.beginTransaction();
        

        try{
            session.persist(song);
        }catch(Exception e){
            System.out.println(e);
        }
        
        session.getTransaction().commit();
        System.out.println("Done!");
    }
}
