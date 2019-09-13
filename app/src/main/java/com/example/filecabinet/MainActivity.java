package com.example.filecabinet;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements IamOnDutyToday {

    final static int MY_REQUEST_CODE = 444;

    Button fc_button;
    RecyclerView fc_recyclerView;
    FileCabinetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fc_recyclerView = findViewById(R.id.fc_recyclerview);
        adapter = new FileCabinetAdapter();
        adapter.teacher = this;

        fc_recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        fc_recyclerView.setLayoutManager(manager);

        fc_button = findViewById(R.id.fc_button);
        fc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FileActivity.class);
                startActivityForResult(intent, MY_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Student student = (Student) data.getSerializableExtra(FileActivity.MY_KEY);
                adapter.fileCabinet(student);

            }
        }
    }

    @Override
    public void openFile(Student student) {
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra(DetailsActivity.STUDY_KEY, student);
        startActivity(intent);
    }
}



//ПОСЛЕ СДЕЛАТЬ КЛИКАБЕЛЬНЫМ vh И ПРИ НАЖАТИИ НА НЕГО ДОЛЖНО ОТКРЫВАТЬСЯ НОВОЕ АКТИВИТИ С ИНФОРМАЦИЕЙ О СТУДЕНТЕ
//3 экрана: 1. список студентов (имя и курс), 2. информация о студенте (полная инфо-я), 3. создание студента



