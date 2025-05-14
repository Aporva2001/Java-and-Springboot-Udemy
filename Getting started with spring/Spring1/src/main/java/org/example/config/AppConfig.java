package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

// If we have to configure
@Configuration

// If we want the spring to check all the components and check if they have @Component added on the top of it
@ComponentScan("org.example") // Here we have mentioned the base package where all the components reside

public class AppConfig {

//    @Bean
//    public Alien alien( Computer com){ // @Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//
//
//    }
////    @Bean(name = "com2")
////    @Bean(name = {"com2","desktop1","Beast"})
//    @Bean
//    // If we want to make the bean a prototype bean
////    @Scope("prototype")
//    public Desktop desktop(){ // The default name of the bean is the method name
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
