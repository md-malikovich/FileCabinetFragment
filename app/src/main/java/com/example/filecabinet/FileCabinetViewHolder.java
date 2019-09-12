package com.example.filecabinet;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FileCabinetViewHolder extends RecyclerView.ViewHolder {

    TextView vh_fname;
    TextView vh_sname;
    TextView vh_gender;
    TextView vh_age;
    TextView vh_specialization;

    public FileCabinetViewHolder(@NonNull View itemView) {
        super(itemView);

        vh_fname = itemView.findViewById(R.id.vh_fname);
        vh_sname = itemView.findViewById(R.id.vh_sname);
        vh_gender = itemView.findViewById(R.id.vh_gender);
        vh_age = itemView.findViewById(R.id.vh_age);
        vh_specialization = itemView.findViewById(R.id.vh_specialization);
    }

    public void onBind(Student student) {
        vh_fname.setText(student.firstName);
        vh_sname.setText(student.secondName);
        vh_gender.setText(student.gender);
        vh_age.setText(student.age);
        vh_specialization.setText(student.specialization);
    }

}
