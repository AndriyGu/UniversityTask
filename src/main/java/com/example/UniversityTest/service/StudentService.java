package com.example.UniversityTest.service;

import com.example.UniversityTest.model.DTO.requestDTO.StudentAddDTO;
import com.example.UniversityTest.model.DTO.respounseDTO.StudentDTO;
import com.example.UniversityTest.model.Group;
import com.example.UniversityTest.model.Student;
import com.example.UniversityTest.repository.GroupRepository;
import com.example.UniversityTest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.naming.AuthenticationException;
import java.util.*;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    GroupRepository groupRepository;

    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        List<StudentDTO> result = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();

        if (studentList == null || studentList.size()==0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        for (Student temp:studentList) {
            StudentDTO dto = new StudentDTO();
            dto.setId(temp.getId());
            dto.setFirstName(temp.getFirstName());
            dto.setLastName(temp.getLastName());
            dto.setGroups(temp.getGroups().getName());
            dto.setYear(temp.getYear());

            result.add(dto);
        }

        return new ResponseEntity<List<StudentDTO>>(result, HttpStatus.OK);
    }

    public ResponseEntity<StudentDTO>getStudentById(int id){

        Optional<Student> result = studentRepository.findById(id);
        if(result.isEmpty()){return new ResponseEntity<StudentDTO>(HttpStatus.NOT_FOUND);}

        StudentDTO dto = new StudentDTO();
        dto.setId(result.get().getId());
        dto.setFirstName(result.get().getFirstName());
        dto.setLastName(result.get().getLastName());
        dto.setGroups(result.get().getGroups().getName());
        dto.setYear(result.get().getYear());

        return new ResponseEntity<StudentDTO>(dto, HttpStatus.OK);
    }

    /*@PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody StudentAddDTO request){
            Student newStudent = new Student();

            newStudent.setFirstName(request.getFirstName());
            newStudent.setLastName(request.getLastName());
            newStudent.setYear(request.getYear());

            (groupRepository.findGroupByName(request.getGroupName())).map(newStudent.setGroups();).orElse();

        Optional.of(groupRepository.findGroupByName(request.getGroupName()))                 // definitely have the service
                .map(Group::getId)   // getEmployee() might return null
                .map(Employee::getId)                // get ID from employee if there is one
                .ifPresent(System.out::println);

        return ResponseEntity.ok(res);
            return ResponseEntity.badRequest().body(res);
        }

    }*/
}
