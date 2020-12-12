package com.example.passio.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.passio.R;
import com.example.passio.home.Home;
import com.example.passio.member.AdapterCard;
import com.example.passio.member.BeanCard;
import com.example.passio.member.MemberCard;

import java.util.ArrayList;

public class DatHang extends AppCompatActivity {
    ListView lv135;
    AdapterCard adapter135;
    ArrayList<BeanCard> arr_bean135;
    ImageView imageView135;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_hang);
        homeData();
        // tạo cho vui lấy của member
        imageView135 = findViewById(R.id.btnback);
        imageView135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DatHang.this, Home.class);
                startActivity(intent);
            }
        });
    }
    private void homeData(){

        lv135= findViewById(R.id.listlsu);
        arr_bean135= new ArrayList<>();
        arr_bean135.add(new BeanCard(R.drawable.sanpham1,"Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","HSD: 20/10/2020"));
        arr_bean135.add(new BeanCard(R.drawable.sanpham4,"Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","HSD: 20/10/2020"));
        arr_bean135.add(new BeanCard(R.drawable.sanpham2,"Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","HSD: 20/10/2020"));
        adapter135=new AdapterCard(arr_bean135, DatHang.this);
        lv135.setAdapter(adapter135);
    }
}