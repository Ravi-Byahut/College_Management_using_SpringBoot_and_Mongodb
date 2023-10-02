package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.teachers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface teachersRepository extends MongoRepository<teachers, Integer> {

}
