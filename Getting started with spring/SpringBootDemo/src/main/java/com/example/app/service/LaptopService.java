package com.example.app.service;

import com.example.app.LaptopRepository;
import com.example.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// we can use the service class as service class and component class do the same thing and the project is managed more efficiently and is easy to document the code
@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap){
//        System.out.println("Method called");
        repo.save(lap);
    }
    public boolean isGoodForProg(Laptop lap){
    return true;
    }
}


