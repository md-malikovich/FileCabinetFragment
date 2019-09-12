package com.example.filecabinet;

import java.io.Serializable;

public class Student implements Serializable {

    String firstName;
    String secondName;
    String gender;
    String specialization;

    public Student(String firstName, String secondName, String gender, String specialization) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.specialization = specialization;
    }
}
