package com.android.mmitschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.mmitschool.attendance.AttendanceActivity;
import com.android.mmitschool.class_rutine.ClassRutineActivity;
import com.android.mmitschool.exam.ExamActivity;
import com.android.mmitschool.exam.exam_report.ExamReportActivity;
import com.android.mmitschool.exam.exam_routin.ExamRoutineActivity;
import com.android.mmitschool.fees.DueFeesActivity;
import com.android.mmitschool.profile.ProfileActivity;
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



        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        menu = bottomNavigationView.getMenu();
        menu.findItem(R.id.bottom_nav_my_school).setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bottom_nav_online_exam){
                    startActivity(new Intent(MainActivity.this, ExamActivity.class));
                    finish();


                }else if (item.getItemId() == R.id.bottom_nav_listNav){

                }else if (item.getItemId() == R.id.bottom_nav_my_school) {


                }
                return false;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawers();

        if (item.getItemId() == R.id.nav_Logout) {


        } else if (item.getItemId() == R.id.nav_profile){
            startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            finish();
        }else if (item.getItemId() == R.id.nav_attendance){
            startActivity(new Intent(MainActivity.this, AttendanceActivity.class));
            finish();

        }else if (item.getItemId() == R.id.nav_class_routine){
            startActivity(new Intent(MainActivity.this, ClassRutineActivity.class));
            finish();
        }else if (item.getItemId() == R.id.nav_exam_routine){
            startActivity(new Intent(MainActivity.this, ExamRoutineActivity.class));
            finish();
        }
        else if (item.getItemId() == R.id.nav_exam_report){
            startActivity(new Intent(MainActivity.this, ExamReportActivity.class));
            finish();
        }else if (item.getItemId() == R.id.nav_Payment){
            startActivity(new Intent(MainActivity.this, DueFeesActivity.class));
            finish();
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
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
                startActivity(new Intent(MainActivity.this, ClassRutineActivity.class));
                finish();
                break;

            case R.id.lyt_my_exam_routine:
                startActivity(new Intent(MainActivity.this, ExamRoutineActivity.class));
                finish();
                break;
            case R.id.lyt_my_profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                finish();
                break;
            case R.id.lyt_my_exam_report:
                startActivity(new Intent(MainActivity.this, ExamReportActivity.class));
                finish();
                break;
        }


    }
}