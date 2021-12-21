package com.example.UniversityTest.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private Set<SpecialtyToSubject> specialtyToSubjects;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "subject")
    private List<StudentsToSubject> studentsToSubjects;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Schedule> schedule;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "subject")
    private List<ProfessorsToSubject> professorsToSubjects;

    public Subject() {
    }

    public Subject(String name, Set<SpecialtyToSubject> specialtyToSubjects, List<StudentsToSubject> studentsToSubjects, List<Schedule> schedule, List<ProfessorsToSubject> professorsToSubjects) {
        this.name = name;
        this.specialtyToSubjects = specialtyToSubjects;
        this.studentsToSubjects = studentsToSubjects;
        this.schedule = schedule;
        this.professorsToSubjects = professorsToSubjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SpecialtyToSubject> getSpecialtyToSubjects() {
        return specialtyToSubjects;
    }

    public void setSpecialtyToSubjects(Set<SpecialtyToSubject> specialtyToSubjects) {
        this.specialtyToSubjects = specialtyToSubjects;
    }

    public List<StudentsToSubject> getStudentsToSubjects() {
        return studentsToSubjects;
    }

    public void setStudentsToSubjects(List<StudentsToSubject> studentsToSubjects) {
        this.studentsToSubjects = studentsToSubjects;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public List<ProfessorsToSubject> getProfessorsToSubjects() {
        return professorsToSubjects;
    }

    public void setProfessorsToSubjects(List<ProfessorsToSubject> professorsToSubjects) {
        this.professorsToSubjects = professorsToSubjects;
    }


}
