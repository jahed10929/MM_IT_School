package com.android.mmitschool.attendance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;

import java.util.Calendar;

public class AttendanceActivity extends AppCompatActivity {
    Toolbar toolbar;
    private TextView titleName;
    private ImageView backButtonID;

    Calendar calendar;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Attendance");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);



        CalendarView simpleCalendarView = (CalendarView) findViewById(R.id.calendar_view); // get the reference of CalendarView
//        simpleCalendarView.setDate(1463918226920L); // set selected date 22 May 2016 in milliseconds

        Log.d("TAG", "onCreate: "+simpleCalendarView.getFirstDayOfWeek());
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(AttendanceActivity.this, MainActivity.class));
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(AttendanceActivity.this, MainActivity.class));
        finish();
    }
}