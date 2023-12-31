package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.entity.students;
import com.example.CollegeManagement.repository.studentsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class teachersController {

    Logger log = LoggerFactory.getLogger(teachersController.class);

    @Autowired
    private studentsRepository repository;

    @PostMapping("/teacher/addStudent")
    public String saveStudent(@RequestBody students stud) {
        log.debug("Teacher Added a Student or updated a Student by Id: "+stud.getId());
        repository.save(stud);
        return "student added with id : " +stud.getId();

    }

    @GetMapping("/teacher/getStudents")
    public List<students> getStudents(){
        log.debug("Teacher got the All the Info of the Students");
        return repository.findAll();
    }
    @GetMapping("/teacher/findStudent/{id}")
    public Optional<students> getStudent(@PathVariable int id){
        log.debug("Teacher got the details of a Student by Id: "+id);
        return repository.findById(id);
    }

    @DeleteMapping("/teacher/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        log.debug("Teacher deleted a Student by Id: "+id);
        repository.deleteById(id);
        return "Student Deleted with id : " +id;
    }

}
