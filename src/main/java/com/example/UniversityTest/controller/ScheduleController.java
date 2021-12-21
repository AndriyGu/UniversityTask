package com.example.UniversityTest.controller;

import com.example.UniversityTest.model.DTO.ScheduleDTO;
import com.example.UniversityTest.model.Schedule;
import com.example.UniversityTest.service.ScheduleService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @Operation(summary = "")
    @GetMapping("/getScheduleDataStudent/{firstName}/{lastName}/{date}")
    ResponseEntity<ScheduleDTO> getScheduleDataStudentName(
                                        @PathVariable("firstName") String firstName,
                                        @PathVariable("lastName") String lastName,
                                        @PathVariable("date")  String date){


         return scheduleService.getScheduleDataStudentName(firstName, lastName, LocalDate.parse(date));
    //return new ResponseEntity<List<HerDTO>>(hhh,HttpStatus.OK);
    }


}
