package com.example.alcchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private TextView button1;
    private TextView button2;
    private ImageView button3;
    private ImageView button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (TextView) findViewById(R.id.profileBtn);
        button2 = (TextView) findViewById(R.id.alcBtn);
        button3 = (ImageView) findViewById(R.id.alcBtn1);
        button4 = (ImageView) findViewById(R.id.profileBtn1);

//        Toolbar toolbar = findViewById(R.id.toolbar);
////        setActionBar(toolbar);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlc();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlc();
            }
        });
    }
    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void openAlc(){
        Intent intent = new Intent(this, Webpage.class);
        startActivity(intent);
    }
}

