package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    // here we need to create a connection between alien and laptop
    // so that the the application knows that the laptop object below will come from the spring framework
    @Autowired
    Laptop laptop;

    public void code(){
        laptop.compile();

    }
}
