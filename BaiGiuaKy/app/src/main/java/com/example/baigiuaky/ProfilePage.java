package com.example.baigiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePage extends AppCompatActivity {

    Button butBack, butLogOut;
    Object HomePage, StartPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_profile);

        butBack = findViewById(R.id.btnBack_ofPro);
        butLogOut = findViewById(R.id.btnLogOut_ofPro);

        butBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage();
            }
        });

        butLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartPage();
            }
        });
    }

    public void openStartPage() {
        Intent intent = new Intent(ProfilePage.this, com.example.baithuchanhgiuaky.StartPage.class);
        startActivity(intent);
    }
    public void openHomePage() {
        Intent intent = new Intent(ProfilePage.this, com.example.baithuchanhgiuaky.HomePage.class);
        startActivity(intent);
    }
}
