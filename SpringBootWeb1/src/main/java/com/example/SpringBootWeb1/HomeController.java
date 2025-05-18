package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv){
        int result = num + num2;

        mv.addObject("result",result);
        System.out.println(result);
        System.out.println("in add");
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addAlien")
    // If we want to use different variable name than the query params
    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
    Alien alien= new Alien();
    alien.setAid(aid);
    alien.setAname(aname);
        mv.addObject("alien",alien);
//        System.out.println(result);
        System.out.println("in add");
        mv.setViewName("result");

        return mv;
    }
}
