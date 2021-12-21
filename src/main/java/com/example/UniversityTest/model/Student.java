package com.example.UniversityTest.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private int year;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="group_id")
    private Group groups;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
    private List<StudentsToSubject> studentsToSubjects;

    public Student() {
    }

    public Student(String firstName, String lastName, int year, Group groups, List<StudentsToSubject> studentsToSubjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.groups = groups;
        this.studentsToSubjects = studentsToSubjects;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }

    public List<StudentsToSubject> getStudentsToSubjects() {
        return studentsToSubjects;
    }

    public void setStudentsToSubjects(List<StudentsToSubject> studentsToSubjects) {
        this.studentsToSubjects = studentsToSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
