package com.android.mmitschool.fees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;
import com.android.mmitschool.attendance.AttendanceActivity;

import org.json.JSONObject;

import java.util.ArrayList;

public class DueFeesActivity extends AppCompatActivity {
    Toolbar toolbar;

    RecyclerView due_recyclerView, complete_recyclerView;

    ArrayList<CompleteFeesModel> completeFeesModels;
    ArrayList<DueFeesModel> dueFeesModels;
    DueFeesAdapter dueFeesAdapter;
    CompleteFeesAdapter completeFeesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_due_fees);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fees Due");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);

        due_recyclerView = findViewById(R.id.due_recyclerView);
        complete_recyclerView = findViewById(R.id.complete_recyclerView);

        setDeu();
        setComplete();


    }

    @SuppressLint("NotifyDataSetChanged")
    private void setComplete() {

        completeFeesModels = new ArrayList<CompleteFeesModel>();
        complete_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        completeFeesAdapter = new CompleteFeesAdapter(completeFeesModels, DueFeesActivity.this);
        complete_recyclerView.setAdapter(completeFeesAdapter);

        completeFeesModels.add(new CompleteFeesModel("#12345", "September",
                "11 Oct 2021", "\u09F3 1000", "Cash On Desk"));
        completeFeesModels.add(new CompleteFeesModel("#12345", "September",
                "11 Oct 2021", "\u09F3 1000", "Cash On Desk"));
        completeFeesModels.add(new CompleteFeesModel("#12345", "September",
                "11 Oct 2021", "\u09F3 1000", "Cash On Desk"));
        completeFeesModels.add(new CompleteFeesModel("#12345", "September",
                "11 Oct 2021", "\u09F3 1000", "Cash On Desk"));


        completeFeesAdapter.notifyDataSetChanged();
    }

    @SuppressLint("NotifyDataSetChanged")
    private void setDeu() {
        dueFeesModels = new ArrayList<DueFeesModel>();
        due_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dueFeesAdapter = new DueFeesAdapter(dueFeesModels, DueFeesActivity.this);
        due_recyclerView.setAdapter(dueFeesAdapter);

        dueFeesModels.add(new DueFeesModel("#12345", "October",
                "11 Oct 2021", "\u09F3 1000"));
        dueFeesModels.add(new DueFeesModel("#12345", "November",
                "11 Nov 2021", "\u09F3 1000"));

        dueFeesAdapter.notifyDataSetChanged();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(DueFeesActivity.this, MainActivity.class));
            finish();
//                    //overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(DueFeesActivity.this, MainActivity.class));
        finish();
    }
}