package com.example.foodcalorie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class blog extends AppCompatActivity {

    private Button cal, food, blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        food=findViewById(R.id.btnfood3);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(blog.this, food.class);
                startActivity(intent);
            }
        });


        blog=findViewById(R.id.btnblog3);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(blog.this, blog.class);
                startActivity(intent);
            }
        });

        cal=findViewById(R.id.btncal3);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(blog.this, calorie.class);
                startActivity(intent);
            }
        });


    }
}