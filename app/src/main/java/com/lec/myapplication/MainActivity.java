package com.lec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView image1;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.image1);
        btn1=findViewById(R.id.btn_1);
        image1.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View View) {

    image1.setVisibility(View.VISIBLE);
    image1.setImageResource(R.drawable.nature);
        }});}
    }