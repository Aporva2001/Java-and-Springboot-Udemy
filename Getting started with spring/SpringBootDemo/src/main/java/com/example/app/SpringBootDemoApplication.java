package com.example.app;

import com.example.app.model.Alien;
import com.example.app.model.Laptop;
import com.example.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		LaptopService service= context.getBean(LaptopService.class);
		Laptop lap= context.getBean(Laptop.class);

		// If we want to add methods related to laptop we can use service class
		service.addLaptop(lap);
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
	}
}
