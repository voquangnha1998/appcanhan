package com.example.passio.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.passio.LoginProfile;
import com.example.passio.R;
import com.example.passio.account.Account;
import com.example.passio.member.MemberCard;
import com.example.passio.noti.Notifications;
import com.example.passio.order.Order;
import com.example.passio.qua.Qua;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    RecyclerView recyclerView135;
    ArrayList<QuanGanToi> arrayList135;

    ListView lv135;
    ListViewBaseAdapter adapter135;
    ArrayList<ListViewBean> arr_bean135;

    ImageButton btnqua135,btnnoti135,btnlocal135;
    ImageView imageView135, user135,card135;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ///
        final Dialog dialog = new Dialog(Home.this);
        dialog.setContentView(R.layout.dialog);
        dialog.show();
        ImageView imageView = dialog.findViewById(R.id.close);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        ////

        mapping2();
        homeData();
        btnqua135 = findViewById(R.id.btnqua);
        user135= findViewById(R.id.user);
        btnqua135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Qua.class);
                startActivity(intent);
            }
        });
        user135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Account.class);
                startActivity(intent);
            }
        });
        //
        btnnoti135 = findViewById(R.id.btnnoti);
        btnnoti135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Notifications.class);
                startActivity(intent);
            }
        });
        btnlocal135 = findViewById(R.id.local);
        btnlocal135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //
        imageView =findViewById(R.id.imgorder);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Order.class);
                startActivity(intent);
            }
        });
        card135 = findViewById(R.id.card);
        card135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MemberCard.class);
                startActivity(intent);
            }
        });
        lv135.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Home.this,arr_bean135.get(position).getLangName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this,ChiTiet.class);
                intent.putExtra("name",arr_bean135.get(position).getLangName());
                intent.putExtra("image",arr_bean135.get(position).getImage());

                startActivity(intent);
            }
        });
        recyclerView135.addOnItemTouchListener(
                new RecyclerItemClickListener(Home.this, recyclerView135 ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Toast.makeText(Home.this,arrayList135.get(position).getLangName(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Home.this,ChiTiet.class);
                        intent.putExtra("name",arrayList135.get(position).getLangName());
                        intent.putExtra("image",arrayList135.get(position).getImg());

                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    }

    private void mapping2(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Home.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView135 =(RecyclerView) findViewById(R.id.recyclerView);
        arrayList135=new ArrayList<>();
        arrayList135.add(new QuanGanToi(R.drawable.uudai1));
        arrayList135.add(new QuanGanToi(R.drawable.ic_passio_address_1));
        arrayList135.add(new QuanGanToi(R.drawable.ic_passio_address_2));
        arrayList135.add(new QuanGanToi(R.drawable.ic_passio_address_3));
        arrayList135.add(new QuanGanToi(R.drawable.ic_passio_address_4));

        recyclerView135.setLayoutManager(linearLayoutManager);
        AdapterRecyclerView adapterQuanGanToi= new AdapterRecyclerView(arrayList135,Home.this);
        recyclerView135.setAdapter(adapterQuanGanToi);
    }
    private void homeData(){

        lv135= findViewById(R.id.list);
        arr_bean135= new ArrayList<>();
        arr_bean135.add(new ListViewBean(R.drawable.sanpham1,"NHÂN ĐÔI NIỀM VUI GIÁNG SINH _ TẶNG 40% LY THỨ 2"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham4,"GREEN XMAS - GIÁNG SINH XANH, GIÁNG SINH AN LÀNG"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham2,"THƯỞNG THỨC KEM GELATO NGON CHUẨN Ý TẠI PASSIO VỚI GIÁ CHỈ 29.000đ"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham5,"PASSIO COFFEE 145 HOÀNG HOA THÁM, ĐÀ NẴNG"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham3, "TƯNG BỪNG KHAI TRƯƠNG KHÔNG GIAN COFFEE ĐĂNG CẤP NHẤT"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham1,"NHÂN ĐÔI NIỀM VUI GIÁNG SINH _ TẶNG 40% LY THỨ 2"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham4,"GREEN XMAS - GIÁNG SINH XANH, GIÁNG SINH AN LÀNG"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham2,"THƯỞNG THỨC KEM GELATO NGON CHUẨN Ý TẠI PASSIO VỚI GIÁ CHỈ 29.000đ"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham5,"PASSIO COFFEE 145 HOÀNG HOA THÁM, ĐÀ NẴNG"));
        arr_bean135.add(new ListViewBean(R.drawable.sanpham3, "TƯNG BỪNG KHAI TRƯƠNG KHÔNG GIAN COFFEE ĐĂNG CẤP NHẤT"));
        adapter135=new ListViewBaseAdapter(arr_bean135,Home.this);
        lv135.setAdapter(adapter135);
    }
}