package com.android.mmitschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.mmitschool.attendance.AttendanceActivity;
import com.android.mmitschool.class_rutine.ClassRutineActivity;
import com.android.mmitschool.exam_routin.ExamRoutineActivity;
import com.android.mmitschool.fees.DueFeesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;

    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;
    Menu menu;

    DrawerLayout drawerLayout;
    ImageView closeDrawerButton;
    ActionBarDrawerToggle actionBarDrawerToggle;


    LinearLayout attendance_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MM IT School");

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        attendance_view = findViewById(R.id.attendance_view);


        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    public void onButtonClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.attendance_view:
                startActivity(new Intent(MainActivity.this, AttendanceActivity.class));
                finish();
                break;
            case R.id.fees_view:
                startActivity(new Intent(MainActivity.this, DueFeesActivity.class));
                finish();
                break;
            case R.id.lyt_my_class_routine:
                Log.d("TAG", "onButtonClick: Clicked");
                startActivity(new Intent(MainActivity.this, ClassRutineActivity.class));
                finish();
                break;

                case R.id.lyt_my_exam_routine:
                Log.d("TAG", "onButtonClick: Clicked");
                startActivity(new Intent(MainActivity.this, ExamRoutineActivity.class));
                finish();
                break;
        }


    }
}