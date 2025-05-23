package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    // If we want to use ModelAttribute on function level
    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    // If we want to use different variable name than the query params
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv){
        int result = num + num2;

        mv.addObject("result",result);
        System.out.println(result);
        System.out.println("in add");
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addAlien")
    // If we want to use different name other than alien
//    public String addAlien(@ModelAttribute("alien1") Alien alien){
    // If we dont want to have the same name we can skip the model attribute
    public String addAlien(Alien alien){
        System.out.println("in add alien");
        return "result";
    }
}
