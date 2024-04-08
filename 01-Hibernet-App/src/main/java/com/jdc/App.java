package com.jdc;

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
       s.setName("Komal");
       s.setAge(22);
       s.setGender("Female");
       
       Transaction tx = session.beginTransaction();
       
       session.save(s);
       
       tx.commit();
       
       System.out.println("Records inserted sucessfully");
       
       session.close();
       
   
        
    }
}
