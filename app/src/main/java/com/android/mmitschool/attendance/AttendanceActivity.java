package com.android.mmitschool.attendance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;

import java.util.Calendar;

public class AttendanceActivity extends AppCompatActivity {
    Toolbar toolbar;

    Calendar calendar;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        setContentView(R.layout.activity_attendance);
        calendar = Calendar.getInstance();
        int diff = calendar.get(Calendar.JANUARY);

        //cal = Calendar.getInstance(); // In Thailand this gives the buddhist calendar, do you want this?
        calendar.add(Calendar.DATE, 16); // 16 days from now, what is the intention or meaning???
        calendar.add(diff, 10); // first argument must be a defined constant in java.util.Calendar


        calendarView = findViewById(R.id.calendar);

        calendarView.setEnabled(false);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                String msg = "Selected date Day: " + i2 + " Month : " + (i1 + 1) + " Year " + i;
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();


            }
        });

    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(AttendanceActivity.this, MainActivity.class));
        finish();
    }
}