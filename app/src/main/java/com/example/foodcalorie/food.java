package com.example.foodcalorie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class food extends AppCompatActivity {

    private Button cal, food, blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        food=findViewById(R.id.btnfood2);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.this, food.class);
                startActivity(intent);
            }
        });


        blog=findViewById(R.id.btnblog2);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.this, blog.class);
                startActivity(intent);
            }
        });

        cal=findViewById(R.id.btncal2);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(food.this, calorie.class);
                startActivity(intent);
            }
        });

    }
}