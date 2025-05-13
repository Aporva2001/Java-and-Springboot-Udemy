package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj1= (Alien) context.getBean("alien1");
        // If we directly want to get the object without doing typecasting here
//        Alien obj1= context.getBean("alien1", Alien.class);
        // If we dont give the bean name then it will search by type
        Alien obj1= context.getBean(Alien.class);
//        obj1.age=21;
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
//        Laptop obj1 = (Laptop) context.getBean("lap");
//        Alien obj = new Alien();
//        obj.code();
        }
    }