package com.everything_in_java.learning.springDataJpaMapping.controller;

import com.everything_in_java.learning.springDataJpaMapping.model.Student;
import com.everything_in_java.learning.springDataJpaMapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return  studentRepository.save(student);
    }

}
