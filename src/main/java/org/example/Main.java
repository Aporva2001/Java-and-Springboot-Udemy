package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        Student s1 = new Student();
//        s1.setRollNo(105);
//        s1.setsName("Aman");
//        s1.setsAge(23);
        Student s2 = null;
        SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
        Session session = sf.openSession();
        // we dont need transasctions when we are getting the data from the database

        // Transaction transaction = session.beginTransaction();
//        session.persist(s1);
        //transaction.commit();

        s2 = session.get(Student.class, 102); // Student.class is the type of data which we want to fetch and 102 is the primary key
        session.close();
        sf.close();
        System.out.println(s2);

    }

}