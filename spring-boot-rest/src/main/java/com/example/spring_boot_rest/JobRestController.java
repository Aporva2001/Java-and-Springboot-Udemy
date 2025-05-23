package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
// by default the controller assumes that we are returning the jsp data
@RestController
// If we want to allow the cross origin cors policy
@CrossOrigin("http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping(path = "jobPosts",produces = {"application/json"}) // This method will only return json
//    @ResponseBody
    // if we are using response body we don't have to use rest controller
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
    @GetMapping("jobPost/{postId}")
    // If we want the spring to find the path in curly braces we have to use path variable
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }
    @PostMapping(path = "jobPost",consumes = {"application/xml"}) // This method will accept only xml data

    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        return service.deleteJob(postId);

    }
}
