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
        
        Address a = new Address();
        a.setCity("Dhule");
        a.setCountry("India");
        a.setState("MH");
        a.setPincode("431178");
        
        Student s = new Student();
        
//        s.setId(1);
        s.setName("Raosaheb");
        s.setCourse("Mech");
        s.setAge(24);
        s.setAddress(a);
        
        Transaction tx = session.beginTransaction();
        
        s = session.load(Student.class, new Integer(2));
        
        System.out.println("Id : " + s.getId());
        System.out.println("Name : " + s.getName());
        
//        s = session.get(Student.class, new Integer(2));
//        System.out.println("Id : " + s.getId());
//        System.out.println("Name : " + s.getName());
        
        
        //session.save(s);
        
        tx.commit();
        
        System.out.println("Inserted sucessfully");
        
        session.close();
        
    }
}
