package com.example.foodcalorie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class calorie extends AppCompatActivity {

    private Button cal, food, blog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);

        food=findViewById(R.id.btnfood1);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calorie.this, food.class);
                startActivity(intent);
            }
        });


        blog=findViewById(R.id.btnblog1);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calorie.this, blog.class);
                startActivity(intent);
            }
        });

        cal=findViewById(R.id.btncal1);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calorie.this, calorie.class);
                startActivity(intent);
            }
        });



    }


}