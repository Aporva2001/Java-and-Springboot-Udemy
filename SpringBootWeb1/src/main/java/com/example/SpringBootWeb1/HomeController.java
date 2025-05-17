package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// If we want to tell spring that this is a controller
@Controller
public class HomeController {
    // If we want to map the request to the home page
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }
}
