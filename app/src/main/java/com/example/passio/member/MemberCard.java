package com.example.passio.member;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ListView;

import com.example.passio.R;
import com.example.passio.order.Order;
import com.example.passio.order.ViewAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MemberCard extends AppCompatActivity {
    ListView lv;
    AdapterCard adapter;
    ArrayList<BeanCard> arr_bean;

    TabLayout mTapLayout;
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_card);
        homeData();
        mTapLayout = findViewById(R.id.tab_layout2);
        mViewPager = findViewById(R.id.viewpager2);
        AdapterView viewPagerAdapter= new AdapterView(MemberCard.this.getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);
    }
    private void homeData(){

        lv= findViewById(R.id.list_coupon);
        arr_bean= new ArrayList<>();
        arr_bean.add(new BeanCard(R.drawable.sanpham1,"Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","HSD: 20/10/2020"));
        arr_bean.add(new BeanCard(R.drawable.sanpham4,"Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","HSD: 20/10/2020"));
        arr_bean.add(new BeanCard(R.drawable.sanpham2,"Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","HSD: 20/10/2020"));
        adapter=new AdapterCard(arr_bean,MemberCard.this);
        lv.setAdapter(adapter);
    }
}