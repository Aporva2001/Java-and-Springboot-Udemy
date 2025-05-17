package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
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

    @RequestMapping("add")
    public String add(HttpServletRequest req){
        // The servlet way of getting the data from the request

        int num1 = Integer.parseInt(req.getParameter("num1")); // It will return a string
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        System.out.println("in add");
        return "result.jsp";
    }
}
