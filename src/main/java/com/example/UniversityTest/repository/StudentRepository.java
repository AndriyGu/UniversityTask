package com.example.UniversityTest.repository;

import com.example.UniversityTest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Override
    Optional<Student> findById(Integer integer);
}
