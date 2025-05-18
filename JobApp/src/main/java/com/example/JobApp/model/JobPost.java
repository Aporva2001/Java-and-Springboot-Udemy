package com.example.JobApp.model;

import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Since we are using lombok we do not have to write the code for getters and setters and for constructors

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {


    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;


}