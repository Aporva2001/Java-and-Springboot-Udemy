package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // If we want to create a container, we have to use an application context, to use application context, we have to use external dependencies of spring

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); // Here we have to mention the configuration file
        //now we can specify the object we want
        Alien obj= (Alien) context.getBean("alien");
        // alien refers to the name of the object
        // here the required type is object but we need the object of type Alien so we have to type cast it
//        Alien obj = new Alien();
        obj.code();
        }
    }