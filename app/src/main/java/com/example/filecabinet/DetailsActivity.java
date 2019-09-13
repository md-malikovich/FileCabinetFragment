package com.example.filecabinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    final static String STUDY_KEY = "study_key";
    TextView dFname;
    TextView dSname;
    TextView dGender;
    TextView dSpecialization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        dFname = findViewById(R.id.details_fname);
        dSname = findViewById(R.id.details_sname);
        dGender = findViewById(R.id.details_gender);
        dSpecialization = findViewById(R.id.details_specialization);

        Student student = getStudent();
        showStudent(student);

        dFname.setText(student.firstName);
        dSname.setText(student.secondName);
        dGender.setText(student.gender);
        dSpecialization.setText(student.specialization);
    }

    private Student getStudent() {
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra(STUDY_KEY);
        return student;
    }

    private void showStudent(Student student) {
        dFname.setText(student.firstName);
        dSname.setText(student.secondName);
        dGender.setText(student.gender);
        dSpecialization.setText(student.specialization);
    }
}
