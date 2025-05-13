package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); // The object is created in this line
        Alien obj= (Alien) context.getBean("alien1");

        Alien obj2= (Alien) context.getBean("alien1");
        // the object will be created 2 time
        Laptop obj1 = (Laptop) context.getBean("lap");
//        Alien obj = new Alien();
        obj.code();
        }
    }