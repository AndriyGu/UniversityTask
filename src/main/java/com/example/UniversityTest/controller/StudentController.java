package com.example.UniversityTest.controller;

import com.example.UniversityTest.model.DTO.respounseDTO.StudentDTO;
import com.example.UniversityTest.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Operation(summary = "select all students")
    @GetMapping
    ResponseEntity<List<StudentDTO>> getAllUsers() {
        return studentService.getAllStudents();
    }

    @Operation(summary = "select student bu ID")
    @GetMapping("/getStudentById/{id}")
    ResponseEntity<StudentDTO> getById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }




}
