package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.students;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentsRepository extends MongoRepository<students, Integer> {

}
