package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// If we have to configure
@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Autowired Computer com){ // Here we are creating a wire between the alien and the desktop
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;


    }
//    @Bean(name = "com2")
//    @Bean(name = {"com2","desktop1","Beast"})
    @Bean
    // If we want to make the bean a prototype bean
//    @Scope("prototype")
    public Desktop desktop(){ // The default name of the bean is the method name
        return new Desktop();
    }

}
