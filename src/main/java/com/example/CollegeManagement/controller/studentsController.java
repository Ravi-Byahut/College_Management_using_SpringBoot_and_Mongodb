package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.entity.students;
import com.example.CollegeManagement.repository.studentsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class studentsController {

    Logger log = LoggerFactory.getLogger(studentsController.class);

    @Autowired
    private studentsRepository repository;



    @GetMapping("/student/findStudent/{id}")
    public Optional<students> getStudent(@PathVariable int id){
        log.debug("A Student got his details by His/Her Id: "+id);
        return repository.findById(id);
    }

}
