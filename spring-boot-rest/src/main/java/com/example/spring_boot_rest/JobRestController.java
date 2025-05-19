package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
// by default the controller assumes that we are returning the jsp data
@RestController
// If we want to allow the cross origin cors policy
@CrossOrigin("http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
//    @ResponseBody
    // if we are using response body we don't have to use rest controller
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
