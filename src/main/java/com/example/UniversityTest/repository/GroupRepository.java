package com.example.UniversityTest.repository;

import com.example.UniversityTest.model.Group;
import com.example.UniversityTest.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface GroupRepository extends JpaRepository<Group, Integer> {
}
