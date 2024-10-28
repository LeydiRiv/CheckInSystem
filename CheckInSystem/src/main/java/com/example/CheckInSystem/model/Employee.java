package com.example.CheckInSystem.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL) //One-to-many relationship between two entities
    @JsonManagedReference //Helps to prevent infinite recursion
    private List<CheckIn> checkIns = new ArrayList<>();

    public List<CheckIn> getCheckIns() {
        return checkIns;
    }

    public void setCheckIns(List<CheckIn> checkIns) {
        this.checkIns = checkIns;
    }

}
