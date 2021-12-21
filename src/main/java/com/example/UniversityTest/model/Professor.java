package com.example.UniversityTest.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professor")
    private List<ProfessorsToSubject> professors;
/*
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "professor")
    private List<Schedule> schedules;*/

    @OneToMany (mappedBy="professor", fetch=FetchType.LAZY)
    private List<Schedule> scheduleCollection;

    public Professor() {
    }

    public Professor(String firstName, String lastName, List<ProfessorsToSubject> professors, List<Schedule> scheduleCollection) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.professors = professors;
        this.scheduleCollection = scheduleCollection;
    }

    public int getId() {
        return id;
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

    public List<ProfessorsToSubject> getProfessors() {
        return professors;
    }

    public void setProfessors(List<ProfessorsToSubject> professors) {
        this.professors = professors;
    }

    public List<Schedule> getScheduleCollection() {
        return scheduleCollection;
    }

    public void setScheduleCollection(List<Schedule> scheduleCollection) {
        this.scheduleCollection = scheduleCollection;
    }
}
