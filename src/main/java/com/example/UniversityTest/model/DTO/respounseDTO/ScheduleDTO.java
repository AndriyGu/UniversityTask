package com.example.UniversityTest.model.DTO.respounseDTO;

import java.time.LocalDate;
import java.util.List;

public class ScheduleDTO {
    private LocalDate localDate;
    private String nameGroup;

    private List<ScheduleInfDTO> scheduleInfDTOS;

    public ScheduleDTO() {
    }

    public ScheduleDTO(LocalDate localDate, String nameGroup, List<ScheduleInfDTO> scheduleInfDTOS) {
        this.localDate = localDate;
        this.nameGroup = nameGroup;
        this.scheduleInfDTOS = scheduleInfDTOS;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setScheduleInfDTOS(List<ScheduleInfDTO> scheduleInfDTOS) {
        this.scheduleInfDTOS = scheduleInfDTOS;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public List<ScheduleInfDTO> getScheduleInfDTOS() {
        return scheduleInfDTOS;
    }

    //    public void addScheduleInfDTOS(ScheduleInfDTO scheduleInfDTOS) {
//        if (this.scheduleInfDTOS==null){
//            this.scheduleInfDTOS = new ArrayList<>();
//        }
//        this.scheduleInfDTOS.add(scheduleInfDTOS);
//    }
}
