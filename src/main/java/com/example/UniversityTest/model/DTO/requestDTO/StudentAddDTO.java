package com.example.UniversityTest.model.DTO.requestDTO;


public class StudentAddDTO {
    private String firstName;
    private String lastName;
    private int year;
    private String groupName;

    public StudentAddDTO() {
    }

    public StudentAddDTO(String firstName, String lastName, int year, String groupName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.groupName = groupName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
