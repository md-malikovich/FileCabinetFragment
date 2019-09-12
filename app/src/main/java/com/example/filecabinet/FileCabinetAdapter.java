package com.example.filecabinet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FileCabinetAdapter extends RecyclerView.Adapter<FileCabinetViewHolder> {

    ArrayList<Student> student;

    public FileCabinetAdapter() {
        student = new ArrayList<>();
        student.add(new Student("Meder", "D", 'm', 36, "Layer"));
        student.add(new Student("Sanjar", "M", 'm', 36, "Programmer"));
        student.add(new Student("Kamila", "M", 'f', 36, "Medic"));
    }

    @NonNull
    @Override
    public FileCabinetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_file_cabinet, parent, false);
        return new FileCabinetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FileCabinetViewHolder holder, int position) {
        holder.onBind(student.get(position));
    }

    @Override
    public int getItemCount() {
        return student.size();
    }
}
