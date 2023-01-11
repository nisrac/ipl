package com.info.studentreg.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.info.studentreg.model.Student;

public interface Sturepo extends MongoRepository<Student, Integer>{

}
