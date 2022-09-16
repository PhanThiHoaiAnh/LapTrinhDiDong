package com.example.baitap4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btnCB;
    Object FirstActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        btnCB = findViewById(R.id.btnBack);
        btnCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFirstActivity();
            }
        });
    }

    public void openFirstActivity() {
        Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
        startActivity(intent);
    }
}