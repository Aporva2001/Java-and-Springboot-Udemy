package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        Laptop l1= session.get(Laptop.class, 2);
        System.out.println(l1);

//        Laptop l2= session.get(Laptop.class,2);
//        System.out.println(l2);

        // It will execute the query only once because of l1 cache
        session.close();

        Session session1= sf.openSession();
        Laptop l3= session1.get(Laptop.class,2);
        System.out.println(l3);
        session1.close();

        sf.close();


    }

}