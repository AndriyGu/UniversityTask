package com.example.UniversityTest.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true)
    private String name;

    @JsonIgnore
    @OneToMany (mappedBy="groups", fetch=FetchType.LAZY)
    private List<Student> studentCollection;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="specialty_id")
    private Specialty specialty;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "groups")
    private Set<Schedule> groupToSchedule;

    public Group() {
    }

    public Group(String name, List<Student> studentCollection, Specialty specialty, Set<Schedule> groupToSchedule) {
        this.name = name;
        this.studentCollection = studentCollection;
        this.specialty = specialty;
        this.groupToSchedule = groupToSchedule;
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

    public List<Student> getStudentCollection() {
        return studentCollection;
    }

    public void setStudentCollection(List<Student> studentCollection) {
        this.studentCollection = studentCollection;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Set<Schedule> getGroupToSchedule() {
        return groupToSchedule;
    }

    public void setGroupToSchedule(Set<Schedule> groupToSchedule) {
        this.groupToSchedule = groupToSchedule;
    }
}
