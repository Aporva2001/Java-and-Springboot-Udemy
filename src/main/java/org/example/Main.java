package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // If we want to update a record first we have to create the object of that

        Student s1= new Student();
//        s1.setsName("Sumit");
//        s1.setRollNo(109);
//        s1.setsAge(25);
        SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction= session.beginTransaction();
        session.merge(s1); // This is used to change the data from the database, if we dont have data it will add it
        // In case of delete if we dont have the data then first we have to get it in an object and then we have to pass it to the remove function
        s1= session.get(Student.class,109);

        session.remove(s1);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }

}