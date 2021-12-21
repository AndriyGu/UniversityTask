package com.example.UniversityTest.service;

import com.example.UniversityTest.model.Student;
import com.example.UniversityTest.repository.StudentRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public getAllStudents(){

    }
}
