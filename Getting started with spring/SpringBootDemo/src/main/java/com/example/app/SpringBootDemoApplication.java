package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		// This is the object created by spring it is called beans
//		Alien obj= new Alien();
		// If we want spring to create the object for us
		// By using Component annotation in the Alien class we are performing
		// dependency injection here
		Alien obj = context.getBean(Alien.class);
		obj.code();

		Alien obj2= context.getBean(Alien.class);
		obj2.code();
//		System.out.println("Hello");
	}

}
