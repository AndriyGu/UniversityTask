package com.example.UniversityTest.repository;

import com.example.UniversityTest.model.Group;
import com.example.UniversityTest.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface GroupRepository extends JpaRepository<Group, Integer> {

    @Override
    Optional<Group> findById(Integer integer);


    Optional<Group> findGroupByName(String groupName);
}
