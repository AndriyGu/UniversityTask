package com.example.UniversityTest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "professorsToSubject")
public class ProfessorsToSubject {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private int numberHours;

        @ManyToOne
        @JsonIgnore
        @JoinColumn(name = "professor_id")
        private Professor professor;

        @ManyToOne
        @JoinColumn(name = "subject_id")
        @JsonIgnore
        private Subject subject;

}
