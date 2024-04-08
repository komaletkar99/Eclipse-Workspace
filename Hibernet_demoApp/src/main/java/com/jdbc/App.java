package com.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernet.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Student s = new Student();
        
        s.setStudentId(101);
        s.setStudentname("Sarthak");
        s.setStudentAge("24");
        s.setStudentCity("Pune");
        
        Transaction tx = session.beginTransaction();
        
        session.save(s);
        
        tx.commit();
        
        System.out.println("Record inserted");
        
        session.close();
        
    }
}
