package com.android.mmitschool.exam_routin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;
import com.android.mmitschool.fees.CompleteFeesAdapter;
import com.android.mmitschool.fees.CompleteFeesModel;
import com.android.mmitschool.fees.DueFeesActivity;

import java.util.ArrayList;

public class ExamRoutineActivity extends AppCompatActivity {

    Toolbar toolbar;

    RecyclerView exam_routine_recyclerview;

    ArrayList<ExamRoutineModel> examRoutineModels;
    ExamRoutineAdapter examRoutineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_routine);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Exam Routine");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);

        exam_routine_recyclerview = findViewById(R.id.exam_routine_recyclerview);

        getExam();
    }

    private void getExam() {
        examRoutineModels = new ArrayList<ExamRoutineModel>();
        exam_routine_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        examRoutineAdapter = new ExamRoutineAdapter(examRoutineModels, ExamRoutineActivity.this);
        exam_routine_recyclerview.setAdapter(examRoutineAdapter);

        examRoutineModels.add(new ExamRoutineModel("11",
                "NOV",
                "Monday",
                "Math",
                "10:30 AM",
                "Final"));
        examRoutineModels.add(new ExamRoutineModel("11",
                "NOV",
                "Monday",
                "Math",
                "10:30 AM",
                "Final"));
        examRoutineModels.add(new ExamRoutineModel("11",
                "NOV",
                "Monday",
                "Math",
                "10:30 AM",
                "Final"));
        examRoutineModels.add(new ExamRoutineModel("11",
                "NOV",
                "Monday",
                "Math",
                "10:30 AM",
                "Final"));
        examRoutineModels.add(new ExamRoutineModel("11",
                "NOV",
                "Monday",
                "Math",
                "10:30 AM",
                "Final"));
        examRoutineModels.add(new ExamRoutineModel("11",
                "NOV",
                "Monday",
                "Math",
                "10:30 AM",
                "Final"));


        examRoutineAdapter.notifyDataSetChanged();
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(ExamRoutineActivity.this, MainActivity.class));
        finish();
    }
}