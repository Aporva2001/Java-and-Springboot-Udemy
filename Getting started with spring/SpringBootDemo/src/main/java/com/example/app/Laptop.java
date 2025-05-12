package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// still we cannot use it in Alien.java because we don't have the container access

public class Laptop {
    @Autowired
    Cpu obj;
    public void compile(){
        System.out.println("Compiling");
        obj.process();
    }
}
