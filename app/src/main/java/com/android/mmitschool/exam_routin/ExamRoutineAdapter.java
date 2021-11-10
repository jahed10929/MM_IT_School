package com.android.mmitschool.exam_routin;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mmitschool.R;
import com.android.mmitschool.fees.CompleteFeesAdapter;

import java.util.ArrayList;

public class ExamRoutineAdapter extends RecyclerView.Adapter<ExamRoutineAdapter.ViewHolder> {
    ArrayList<ExamRoutineModel> examRoutineModels;
    Activity activity;

    public ExamRoutineAdapter(ArrayList<ExamRoutineModel> examRoutineModels, Activity activity) {
        this.examRoutineModels = examRoutineModels;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exam_routine_list_view, parent, false);
        return new ExamRoutineAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String date = examRoutineModels.get(position).getExam_date();
        String day = examRoutineModels.get(position).getExam_day();
        String month = examRoutineModels.get(position).getExam_month();
        String name = examRoutineModels.get(position).getExam_name();
        String time = examRoutineModels.get(position).getExam_time();

        holder.exam_day_tv.setText(day);
        holder.exam_date_tv.setText(date);
        holder.exam_month_tv.setText(month);
        holder.exam_name.setText(name);
        holder.exam_time.setText(time);

    }

    @Override
    public int getItemCount() {
        return examRoutineModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView exam_date_tv, exam_month_tv, exam_name, exam_day_tv, exam_time;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            exam_date_tv = itemView.findViewById(R.id.exam_date_tv);
            exam_month_tv = itemView.findViewById(R.id.exam_month_tv);
            exam_name = itemView.findViewById(R.id.exam_name);
            exam_day_tv = itemView.findViewById(R.id.exam_day_tv);
            exam_time = itemView.findViewById(R.id.exam_time);

        }
    }
}
