package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// If we have to configure
@Configuration
public class AppConfig {
    // Here we have to create the object manually as it is the java based configuration

    // If we want our spring framework to create an object for us, we have to use @Bean
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

}
