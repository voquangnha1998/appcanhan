package com.example.passio.order;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.passio.R;

import java.util.ArrayList;

public class BanChayFragment extends Fragment {
    Context context135;
    View v135;
    GridView gridView135;
    GirdViewBaseAdapter adapter135;
    ArrayList<GirdViewBean> arr_bean135;
    TextView gia4135,somon135,giohang135;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v135 = inflater.inflate(R.layout.fragment_banchay,container,false);
        gridView135 = v135.findViewById(R.id.gridview);
        gia4135 = v135.findViewById(R.id.gia4);
        giohang135 = v135.findViewById(R.id.giohang);
        somon135 = v135.findViewById(R.id.somon);
        context135 = this.getActivity();
        homeData();
        giohang135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context135, GioHang.class);
                startActivity(intent);
            }
        });
        gridView135.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context135,arr_bean135.get(position).getLangName(), Toast.LENGTH_SHORT).show();
                final Dialog dialog = new Dialog(context135);
                dialog.setContentView(R.layout.dialogorder);
                TextView name = dialog.findViewById(R.id.name3);
                ImageView img = dialog.findViewById(R.id.img3);
                final TextView gia = dialog.findViewById(R.id.gia3);
                final TextView thanhgia = dialog.findViewById(R.id.thanhgia);
                final TextView soluong = dialog.findViewById(R.id.soluong);
                //truyền dữ liệu lên dialog
                name.setText(arr_bean135.get(position).getLangName());
                gia.setText(arr_bean135.get(position).getMoTa());
                img.setImageResource(arr_bean135.get(position).getImage());
                // tính thành tiền

                final int a = Integer.parseInt(gia.getText().toString());
                final int b = Integer.parseInt(soluong.getText().toString());
                String s=Integer.toString(tinhTien(a,b));
                thanhgia.setText(s);
                // số lương

                ImageButton cong = dialog.findViewById(R.id.cong);
                ImageButton tru = dialog.findViewById(R.id.tru);

                cong.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        int c = Integer.parseInt(soluong.getText().toString());
                        c=c+1;
                        String s1=Integer.toString(c);
                        soluong.setText(s1);
                        String s=Integer.toString(tinhTien(a,c));
                        thanhgia.setText(s);
                    }
                });
                tru.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int b = Integer.parseInt(soluong.getText().toString());
                        b= b-1;
                        String s2 = Integer.toString(b);
                        soluong.setText(s2);
                        String s=Integer.toString(tinhTien(a,b));
                        thanhgia.setText(s);
                    }
                });
                TextView ok= dialog.findViewById(R.id.themgiohang);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialog.cancel();
                        int e = Integer.parseInt(somon135.getText().toString());
                        e= e+1;
                        String s2 = Integer.toString(e);
                        somon135.setText(s2);
                        /////
                        int f = Integer.parseInt(thanhgia.getText().toString());
                        int g = Integer.parseInt(gia4135.getText().toString());
                        String h=Integer.toString(tinhTong(f,g));
                        gia4135.setText(h);

                    }
                });
                // close dialog
                ImageView imageView = dialog.findViewById(R.id.close);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();

            }
        });


        return v135;
        ///////


    }
    private int tinhTien(int a, int b){
        int s;
        s= a*b;
        return s;
    }
    private int tinhTong(int a, int b){
        int s;
        s= a+b;
        return s;
    }
    private void homeData(){
        gridView135 = v135.findViewById(R.id.gridview);
        arr_bean135 = new ArrayList<>();

        arr_bean135.add(new GirdViewBean(R.drawable.sanpham1, "COMBO CƠM GÀ","60000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham5, "MON NGON MỌI NGÀY","30000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham4,"COMBO CƠM GÀ","39000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham2, "MON NGON MỌI NGÀY","40000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham3, "COMBO CƠM GÀ","10000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham5, "MON NGON MỌI NGÀY","90000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham1,"COMBO CƠM GÀ","40000"));
        arr_bean135.add(new GirdViewBean(R.drawable.sanpham2, "MON NGON MỌI NGÀY","44000"));

        adapter135=new GirdViewBaseAdapter(arr_bean135, this.getActivity());
        gridView135.setAdapter(adapter135);
    }


}