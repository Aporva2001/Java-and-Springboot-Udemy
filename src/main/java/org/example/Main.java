package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(105);
        s1.setsName("Aman");
        s1.setsAge(23);
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure("hibernate.cfg.xml");

        // If we want to write the above 3 lines in one go then

        SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();

                // cfg.buildSessionFactory(); // Here either we use try with resources or we can use session.close()

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

//        session.save(s1);
        // Instead of save() we have to use persist as it follows the JPA conventions

        session.persist(s1);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }

}