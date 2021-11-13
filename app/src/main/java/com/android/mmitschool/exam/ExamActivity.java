package com.android.mmitschool.exam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ExamActivity extends AppCompatActivity {
    private Toolbar toolbar;

    BottomNavigationView bottomNavigationView;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("MM IT School");

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        menu = bottomNavigationView.getMenu();
        menu.findItem(R.id.bottom_nav_online_exam).setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bottom_nav_online_exam){
//                    Toast.makeText(getApplicationContext(), "Dashboard", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.bottom_nav_listNav){

                }else if (item.getItemId() == R.id.bottom_nav_my_school) {
                    startActivity(new Intent(ExamActivity.this, MainActivity.class));
                    finish();

                }
                return false;
            }
        });
    }




}