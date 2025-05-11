package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsAge(23);
        s1.setsName("Aporva");
        s1.setRollNo(101);
        // If we want to use save method in hibernate we have to use Session
        // Since SessionFactory is a heavy weight object we have to use it only once
        Configuration cfg= new Configuration();

        SessionFactory sf= cfg.buildSessionFactory(); // we have used the configuration object to create a session
        Session session = sf.openSession();
        // if we want to connect with the database we have to open the session and to open a session we need a session factory
        // we can use a different session for every unit of work

//        Session session = null; // Since session is an interface so we cannot directly use it
        // If we want to create a session we need to have session factory
        Session.save(s1);
        System.out.println(s1);
        }
    }