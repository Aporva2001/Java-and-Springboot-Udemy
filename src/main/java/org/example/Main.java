package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);


        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook");
        l3.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");
        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Navin");
        a2.setTech("Java");
        a1.setLaptops(Arrays.asList(l1, l2));
        a2.setLaptops(Arrays.asList(l3));

//        l1.setAliens(Arrays.asList(a1,a3));
//        l2.setAliens(Arrays.asList(a1,a2));
//        l3.setAliens(Arrays.asList(a2));



        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        transaction.commit();


        // Here it will not fire a new query but look for the same query in the current session if we want the query to fire then we have to use seperate session

//        System.out.println(a5);
        session.close();
        Session session1= sf.openSession();
        Alien a5 = session1.get(Alien.class, 101);
//        If an entity contains a collection then it will fetch the details related to that entity only
        // not related to a collection, this is called lazy fetching, if we want the data then we can use
        // System.out.println() to fetch the data related to the collection

//        System.out.println(a5);
        session1.close();
        sf.close();


    }

}