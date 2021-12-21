package com.example.UniversityTest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "specialtyToSubject")
public class SpecialtyToSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numberHours;
    private int year;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    @JsonIgnore
    private Subject subject;


    public SpecialtyToSubject() {
    }
}
