package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;

// If we want to tell spring that this is a controller
@Controller
public class HomeController {
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }
}
