package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    @GetMapping({"/","home"}) // If we want to map the request to different pages
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
//    @RequestMapping("handleForm")
    // If we want to handle post request we can use
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }
}
