package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginSdtChild extends AppCompatActivity {
    Button btntt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sdt_child);
        btntt = findViewById(R.id.btnsdttt);
        btntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent intent = new Intent(LoginSdtChild.this, LoginProfile.class);
                        startActivity(intent);

            }
        });
    }
}