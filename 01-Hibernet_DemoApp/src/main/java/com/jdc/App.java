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
        a.setCity("Delhi");
        a.setState("MH");
        a.setCountry("India");
        a.setPincode("432209");
        
      //  Student s= new Student();
        
        Employee e = new Employee();
        
//        s.setId(1);
        e.setName("Pallavi");
        e.setAge(28);
        e.setGender("Female");
        e.setAddress(a);
        
        
        
        Transaction tx = session.beginTransaction();
        
      Employee e1 =  session.get(Employee.class, new Integer(10));
        
        System.out.println("id: " + e.getId());
        System.out.println("name:" + e.getName());
        
        session.save(e);
        
        //session.save(a);
        
        tx.commit();
        
        System.out.println("Sucessfully inserted");
        
        session.close();
    }
}
