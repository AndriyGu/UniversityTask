package com.example.UniversityTest.repository;

import com.example.UniversityTest.model.Schedule;
import com.example.UniversityTest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    @Query("Select s from Schedule s WHERE s.date=?1")
    List<Schedule> findScheduleByData(LocalDate date);

    @Query("Select s from Schedule s WHERE s.date=?1 and s.groups.id=?2")
    Optional<Schedule> findScheduleByDataAndGroupId(LocalDate date, int groupId);

    @Query("Select s from Schedule s WHERE s.groups.id=?1")
    List<Schedule> findScheduleByGroupId(int groupId);

    @Query(value = "Select * from schedule WHERE date = ?1  and group_id = (Select group_id from students where  first_name = ?2 and last_name = ?3)",
            nativeQuery = true)
    List<Schedule> findScheduleByDataAndName(LocalDate date, String firstName, String lastName);


}
