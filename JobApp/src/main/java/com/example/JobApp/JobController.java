package com.example.JobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    @RequestMapping({"/","home"}) // If we want to map the request to different pages
    public String home(){
        return "home";
    }
    @RequestMapping("addjob")
    public String addJob(){
        return "addjob";
    }
}
