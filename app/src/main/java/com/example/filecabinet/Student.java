package com.example.filecabinet;

public class Student {

    public String firstName;
    public String secondName;
    public boolean gender;
    public int age;
    public String specialization;

    public Student(String firstName, String secondName, boolean gender, int age, String specialization) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.specialization = specialization;
    }
}
