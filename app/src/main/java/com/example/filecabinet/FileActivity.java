package com.example.filecabinet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class FileActivity extends AppCompatActivity {

    final static String MY_KEY = "my_key";

    EditText file_fname;
    EditText file_sname;
    EditText file_gender;
    EditText file_age;
    EditText file_specialization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);

        file_fname = findViewById(R.id.file_fname);
        file_sname = findViewById(R.id.file_sname);
        file_gender = findViewById(R.id.file_gender);
        file_age = findViewById(R.id.file_age);
        file_specialization = findViewById(R.id.file_specialization);
    }
}
