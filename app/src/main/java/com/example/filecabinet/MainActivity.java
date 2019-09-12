package com.example.filecabinet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView fc_recyclerView;
    FileCabinetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fc_recyclerView = findViewById(R.id.fc_recyclerview);
        adapter = new FileCabinetAdapter();
        fc_recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        fc_recyclerView.setLayoutManager(manager);
    }
}
