package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        // If we want to fetch the laptop with ram 32
        // in sql we will write
        // select * from laptop where ram = 32
        // in HQL
        // from Laptop where ram = 32

        Query query = session.createQuery("from Laptop where ram = 32");

        // If we want to execute the query
        List<Laptop> laptops= query.getResultList();
//        Laptop l1= session.get(Laptop.class,3);
//        System.out.println(l1);

        System.out.println(laptops);
        session.close();

        sf.close();


    }

}