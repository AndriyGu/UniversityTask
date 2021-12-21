package com.example.UniversityTest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @JsonIgnore
    private Group groups;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    @JsonIgnore
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "class_room_id")
    @JsonIgnore
    private ClassRoom classroom;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="professor_id")
    private Professor professor;

    public Schedule() {
    }

    public Schedule(LocalDate date, Group groups, Subject subject, ClassRoom classroom, Professor professor) {
        this.date = date;
        this.groups = groups;
        this.subject = subject;
        this.classroom = classroom;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ClassRoom getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassRoom classroom) {
        this.classroom = classroom;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
