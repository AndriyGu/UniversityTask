package com.example.UniversityTest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="classroom")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int number;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "classroom")
    private List<Schedule> schedules;

    public ClassRoom() {
    }

    public ClassRoom(int number, List<Schedule> schedules) {
        this.number = number;
        this.schedules = schedules;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
