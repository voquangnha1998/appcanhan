package com.example.passio.order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.passio.R;
import com.example.passio.home.Home;
import com.example.passio.qua.Qua;
import com.example.passio.qua.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class Order extends AppCompatActivity {

    TabLayout mTapLayout;
    ViewPager mViewPager;
    ImageButton imageButton;
    TextView gia4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        mTapLayout = findViewById(R.id.tab_layout1);
        mViewPager = findViewById(R.id.viewpager1);
        imageButton = findViewById(R.id.btnback);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Order.this, Home.class)
                        ;
                startActivity(intent);
            }
        });

        ViewAdapter viewPagerAdapter= new ViewAdapter(Order.this.getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);

        ////

    }
}