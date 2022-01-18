package com.example.UniversityTest.model.DTO.respounseDTO;

public class ScheduleInfDTO {
    private String nameSubject;
    private int numberAuditory;
    private String profName;

    public ScheduleInfDTO() {
    }

    public ScheduleInfDTO(String nameSubject, int numberAuditory, String profName) {
        this.nameSubject = nameSubject;
        this.numberAuditory = numberAuditory;
        this.profName = profName;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setNumberAuditory(int numberAuditory) {
        this.numberAuditory = numberAuditory;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public int getNumberAuditory() {
        return numberAuditory;
    }

    public String getProfName() {
        return profName;
    }
}
