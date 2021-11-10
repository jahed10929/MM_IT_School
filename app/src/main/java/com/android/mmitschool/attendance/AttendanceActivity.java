package com.android.mmitschool.attendance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(AttendanceActivity.this, MainActivity.class));
                finish();
//                    //overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);

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