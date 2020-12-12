package com.example.passio.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.passio.R;

public class ChiTiet extends AppCompatActivity {
    ImageView imageView135;
    TextView textView135;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        imageView135= findViewById(R.id.imgct);
        textView135 = findViewById(R.id.name2);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        imageView135.setImageResource(receivedImage);
        textView135.setText(receivedName);
    }
}