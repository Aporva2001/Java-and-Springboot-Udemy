package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// If we have to configure
@Configuration
public class AppConfig {
    // Here we have to create the object manually as it is the java based configuration

    // If we want to change the name of the bean we can do it as
//    @Bean(name = "com2")
    // If we want to use multiple names for the same bean
//    @Bean(name = {"com2","desktop1","Beast"})
    @Bean
    public Desktop desktop1(){ // The default name of the bean is the method name
        return new Desktop();
    }

}
