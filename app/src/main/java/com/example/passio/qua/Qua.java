package com.example.passio.qua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.passio.R;
import com.example.passio.home.Home;
import com.example.passio.home.ListViewBaseAdapter;
import com.example.passio.home.ListViewBean;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Qua extends AppCompatActivity {
    TabLayout mTapLayout;
    ViewPager mViewPager;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qua);

        //
        mTapLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.viewpager);
        imageButton = findViewById(R.id.btnback);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Qua.this, Home.class)
                        ;
                startActivity(intent);
            }
        });

        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(Qua.this.getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);
    }

}