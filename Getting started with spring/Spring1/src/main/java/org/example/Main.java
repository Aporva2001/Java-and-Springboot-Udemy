package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1= (Alien) context.getBean("alien1");
//        obj1.age=21;
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
//        Laptop obj1 = (Laptop) context.getBean("lap");
//        Alien obj = new Alien();
//        obj.code();
        }
    }