package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); // The object is created in this line
        //singleton object is created when the container is loaded
        // for prototype, object will be created only when we say getBean()

        Alien obj= (Alien) context.getBean("alien1");
        obj.age=21;
        System.out.println(obj.age);
        Alien obj2= (Alien) context.getBean("alien1");
        // the object will be created 1 time as even though we have two different references the object is created one time
        System.out.println(obj2.age);
        Laptop obj1 = (Laptop) context.getBean("lap");
//        Alien obj = new Alien();
//        obj.code();
        }
    }