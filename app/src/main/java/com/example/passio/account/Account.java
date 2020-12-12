package com.example.passio.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.passio.R;
import com.example.passio.home.Home;

public class Account extends AppCompatActivity {
    LinearLayout linearLayout135;
    ImageView imageView135;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        linearLayout135 = findViewById(R.id.lnlichsu);
        imageView135 = findViewById(R.id.btnback);
        imageView135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, Home.class);
                startActivity(intent);
            }
        });
        linearLayout135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, DatHang.class);
                startActivity(intent);
            }
        });
    }
}