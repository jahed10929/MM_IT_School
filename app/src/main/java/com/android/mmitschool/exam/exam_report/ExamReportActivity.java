package com.android.mmitschool.exam.exam_report;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;

import java.util.ArrayList;

public class ExamReportActivity extends AppCompatActivity {
    Toolbar toolbar;

    RecyclerView exam_report_recycler_view;

    ArrayList<ExamResultModel> examResultModels;
    ExamResultAdapter examResultAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_report);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Exam Report");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);

        exam_report_recycler_view = findViewById(R.id.exam_report_recycler_view);
        getExam();
    }


    private void getExam() {
        examResultModels = new ArrayList<ExamResultModel>();
        exam_report_recycler_view.setLayoutManager(new LinearLayoutManager(this));
        examResultAdapter = new ExamResultAdapter(examResultModels, ExamReportActivity.this);
        exam_report_recycler_view.setAdapter(examResultAdapter);

        examResultModels.add(new ExamResultModel("Bangla",
                "100",
                "80"));
        examResultModels.add(new ExamResultModel("English",
                "100",
                "90"));
        examResultModels.add(new ExamResultModel("Math",
                "100",
                "95"));
        examResultModels.add(new ExamResultModel("Science",
                "100",
                "87"));
        examResultModels.add(new ExamResultModel("Social Study",
                "100",
                "75"));
        examResultModels.add(new ExamResultModel("Computer",
                "100",
                "96"));
        examResultAdapter.notifyDataSetChanged();


       // examRoutineAdapter.notifyDataSetChanged();



        /*examResultModels = new ArrayList<ExamResultModel>();
        exam_report_recycler_view.setLayoutManager(new LinearLayoutManager(this));
        examResultAdapter = new ExamResultAdapter(examResultModels, ExamReportActivity.this);
        exam_report_recycler_view.setAdapter(examResultAdapter);

        examResultModels.add(new ExamResultModel("Bangla",
                "100",
                "80"));
        examResultModels.add(new ExamResultModel("English",
                "100",
                "90"));
        examResultModels.add(new ExamResultModel("Math",
                "100",
                "95"));
        examResultModels.add(new ExamResultModel("Science",
                "100",
                "87"));
        examResultModels.add(new ExamResultModel("Social Study",
                "100",
                "75"));
        examResultModels.add(new ExamResultModel("Computer",
                "100",
                "96"));
        examResultAdapter.notifyDataSetChanged();*/
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(ExamReportActivity.this, MainActivity.class));
            finish();
//                    //overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(ExamReportActivity.this, MainActivity.class));
        finish();
    }
}