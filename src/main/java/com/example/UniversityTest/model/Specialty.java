package com.example.UniversityTest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="specialty")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

   @JsonIgnore
    @OneToMany (mappedBy="specialty", fetch=FetchType.LAZY)
    private Collection<Group> groupsCollection;


    public Specialty() {
    }


}
