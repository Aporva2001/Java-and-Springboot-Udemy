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
//        Laptop laptop= session.load(Laptop.class,2);
        // Since the load is deprecated we have to use byId
        Laptop laptop= session.byId(Laptop.class).getReference(2);
        System.out.println(laptop);
        session.close();

        sf.close();


    }

}