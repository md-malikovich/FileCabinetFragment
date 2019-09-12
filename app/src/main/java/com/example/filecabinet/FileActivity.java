package com.example.filecabinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FileActivity extends AppCompatActivity {

    final static String MY_KEY = "my_key";

    EditText file_fname;
    EditText file_sname;
    EditText file_gender;
    EditText file_specialization;
    Button file_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);

        file_fname = findViewById(R.id.file_fname);
        file_sname = findViewById(R.id.file_sname);
        file_gender = findViewById(R.id.file_gender);
        file_specialization = findViewById(R.id.file_specialization);
        file_save = findViewById(R.id.file_button);

        file_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = file_fname.getText().toString();
                String secondName = file_sname.getText().toString();
                String gender = file_gender.getText().toString();
                String specialization = file_specialization.getText().toString();

                Student student = new Student(firstName, secondName, gender, specialization);
                Intent intent = new Intent();
                intent.putExtra(MY_KEY, student);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
