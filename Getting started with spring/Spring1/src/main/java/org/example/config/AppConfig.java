package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// If we have to configure
@Configuration
public class AppConfig {
//    @Bean(name = "com2")
//    @Bean(name = {"com2","desktop1","Beast"})
    @Bean
    // If we want to make the bean a prototype bean
    @Scope("prototype")
    public Desktop desktop1(){ // The default name of the bean is the method name
        return new Desktop();
    }

}
