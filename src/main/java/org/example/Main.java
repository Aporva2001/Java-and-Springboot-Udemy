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
        String brand= "Asus";
//        Query query = session.createQuery("from Laptop where brand like 'Asus'");
        // For strings we have to use like clause
        // If we want to set dynamic parameters
//        Query query = session.createQuery("from Laptop where brand like ?1"); //?1 refers to the parameter number so as to avoid confusion when the length of code increases
        // If we want to fetch a particular field from the database
        Query query = session.createQuery("select model from Laptop where brand like ?1"); //?1 refers to the parameter number so as to avoid confusion when the length of code increases


        query.setParameter(1,brand);
//        Query query = session.createQuery("from Laptop where ram = 32");

        // If we want to execute the query
//        List<Laptop> laptops= query.getResultList();
        // String is more appropriate when we are fetching only one column from the table

        List<String> laptops= query.getResultList();
//        Laptop l1= session.get(Laptop.class,3);
//        System.out.println(l1);

        System.out.println(laptops);
        session.close();

        sf.close();


    }

}