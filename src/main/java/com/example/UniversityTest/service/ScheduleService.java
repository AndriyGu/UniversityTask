package com.example.UniversityTest.service;

import com.example.UniversityTest.controller.ScheduleController;
import com.example.UniversityTest.model.DTO.ScheduleDTO;
import com.example.UniversityTest.model.DTO.ScheduleInfDTO;
import com.example.UniversityTest.model.Schedule;
import com.example.UniversityTest.repository.ScheduleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {

    ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public ResponseEntity<ScheduleDTO> getScheduleDataStudentName
            (String firstName, String lastName, LocalDate data) {


        List<Schedule> schedule = scheduleRepository.findScheduleByDataAndName(data, firstName, lastName);

        if (schedule == null || schedule.size()==0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        ScheduleDTO result = new ScheduleDTO();
        result.setLocalDate(data);
        result.setNameGroup(schedule.get(0).getGroups().getName());

        List<ScheduleInfDTO> scheduleInfDTOList = new ArrayList<>();

        for (Schedule temp : schedule) {
            scheduleInfDTOList.add(new ScheduleInfDTO(
                    temp.getSubject().getName(),
                    temp.getClassroom().getNumber(),
                    temp.getProfessor().getLastName()));
        }
        result.setScheduleInfDTOS(scheduleInfDTOList);
        return new ResponseEntity<ScheduleDTO>(result, HttpStatus.OK);
    }
}
