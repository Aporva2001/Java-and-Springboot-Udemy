package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    // If we want to map the request to the home page
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    // If we want to use different variable name than the query params
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, Model model){
        int result = num + num2;

        model.addAttribute("result",result);
        System.out.println(result);
        System.out.println("in add");
        return "result";
    }
}
