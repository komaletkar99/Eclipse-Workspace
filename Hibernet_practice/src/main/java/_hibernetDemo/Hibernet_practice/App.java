package _hibernetDemo.Hibernet_practice;

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
        
        Person p = new Person();
        p.setId(101);
        p.setName("Komal");
        p.setCity("Pune");
        p.setAge(23);
        p.setGender("Female");
        
        Transaction tx = session.beginTransaction();
        
        session.save(p);
        
        tx.commit();
        
        System.out.println("record inserted");
        
        session.close();
        
    }
}
