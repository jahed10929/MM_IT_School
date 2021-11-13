package com.android.mmitschool.exam.exam_report;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mmitschool.R;

import java.util.ArrayList;

public class ExamResultAdapter extends RecyclerView.Adapter<ExamResultAdapter.ViewHolder> {
    ArrayList<ExamResultModel> examResultModels;
    Activity activity;

    public ExamResultAdapter(ArrayList<ExamResultModel> examResultModels, Activity activity) {
        this.examResultModels = examResultModels;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exam_report_recycler_view_list, parent, false);
        return new ExamResultAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String sub = examResultModels.get(position).getExam_name();
        String total_marks = examResultModels.get(position).getTotal_marks();
        String student_marks = examResultModels.get(position).getStudent_marks();

        holder.exam_sub_name_tv.setText(sub);
        holder.exam_marks_tv.setText(total_marks);
        holder.student_marks_tv.setText(student_marks);


    }

    @Override
    public int getItemCount() {
        return examResultModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView exam_sub_name_tv, exam_marks_tv, student_marks_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            student_marks_tv = itemView.findViewById(R.id.student_marks_tv);
            exam_marks_tv = itemView.findViewById(R.id.exam_marks_tv);
            exam_sub_name_tv = itemView.findViewById(R.id.exam_sub_name_tv);

        }
    }
}
