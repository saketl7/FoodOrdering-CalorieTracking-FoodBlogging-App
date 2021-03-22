package com.example.foodcalorie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button loginbtn;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email=(EditText)findViewById(R.id.inputEmail) ;
        Password=(EditText)findViewById(R.id.inputUsername);
        loginbtn= (Button) findViewById(R.id.btnlogin);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Email.getText().toString(), Password.getText().toString());
            }

            public void validate(String inputEmail, String inputUsername) {
                if((inputEmail.equals("saket@gmail.com"))&&(inputUsername.equals("12345"))){
                    Intent intent = new Intent(login.this, calorie.class);
                    startActivity(intent);
                    Toast.makeText(login.this, "You have successfully logged in", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(login.this,"Please enter correct credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView btn=findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,signup.class));
                loginbtn.setEnabled(false);
            }
        });
    }
}