package com.android.mmitschool.class_rutine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;
import com.android.mmitschool.class_rutine.rutine_fragment.MondayRoutineFragment;
import com.android.mmitschool.class_rutine.rutine_fragment.SaturdayRoutineFragment;
import com.android.mmitschool.class_rutine.rutine_fragment.SundayRoutineFragment;
import com.android.mmitschool.class_rutine.rutine_fragment.ThursdayRoutineFragment;
import com.android.mmitschool.class_rutine.rutine_fragment.TuesdayRoutineFragment;
import com.android.mmitschool.class_rutine.rutine_fragment.WednesdayRoutineFragment;
import com.google.android.material.tabs.TabLayout;

public class ClassRutineActivity extends AppCompatActivity {

    Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_rutine);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Class Routine");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back);

        tabLayout = findViewById(R.id.tab_lyt);
        viewPager = findViewById(R.id.view_pager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);


        vpAdapter.addFragment(new SaturdayRoutineFragment(), "SAT");
        vpAdapter.addFragment(new SundayRoutineFragment(), "SUN");
        vpAdapter.addFragment(new MondayRoutineFragment(), "MON");
        vpAdapter.addFragment(new TuesdayRoutineFragment(), "TUS");
        vpAdapter.addFragment(new WednesdayRoutineFragment(), "WED");
        vpAdapter.addFragment(new ThursdayRoutineFragment(), "THU");
        viewPager.setAdapter(vpAdapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(ClassRutineActivity.this, MainActivity.class));
            finish();
//                    //overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(ClassRutineActivity.this, MainActivity.class));
        finish();
    }
}