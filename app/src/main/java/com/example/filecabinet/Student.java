package com.example.filecabinet;

import java.io.Serializable;

public class Student { //implements Serializable

    String firstName;
    String secondName;
    char gender;
    int age;
    String specialization;

    public Student(String firstName, String secondName, char gender, int age, String specialization) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.specialization = specialization;
    }
}