package com.example.app;

import org.springframework.stereotype.Component;

// If we want the spring to tell that spring has to manage this object
@Component
public class Alien {
    public void code(){
        System.out.println("Coding");
    }
}
