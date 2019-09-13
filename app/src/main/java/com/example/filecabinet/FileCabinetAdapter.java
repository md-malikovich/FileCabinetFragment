package com.example.filecabinet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FileCabinetAdapter extends RecyclerView.Adapter<FileCabinetViewHolder> {

    IamOnDutyToday teacher;

    ArrayList<Student> student;

    public FileCabinetAdapter() {
        student = new ArrayList<>();
        student.add(new Student(0,"Meder", "D", "male", "Layer"));
        student.add(new Student(1, "Sanjar", "M", "male",  "Programmer"));
        student.add(new Student(2, "Kamila", "M", "female",  "Medic"));
    }

    @NonNull
    @Override
    public FileCabinetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_file_cabinet, parent, false);

        FileCabinetViewHolder fc = new FileCabinetViewHolder(view);
        fc.teacher = teacher;
        return fc;
    }

    @Override
    public void onBindViewHolder(@NonNull FileCabinetViewHolder holder, int position) {
        holder.onBind(student.get(position));
    }

    @Override
    public int getItemCount() {
        return student.size();
    }

    public void fileCabinet(Student students) {
        student.add(students);
        notifyDataSetChanged();
    }
}
