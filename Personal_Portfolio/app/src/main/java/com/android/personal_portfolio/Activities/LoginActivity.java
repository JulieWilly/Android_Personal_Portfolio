package com.android.personal_portfolio.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.personal_portfolio.R;

public class LoginActivity extends AppCompatActivity {
    EditText edt_userEmail, edt_userPassword;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (edt_userEmail.getText().equals("Wilfred") && edt_userPassword.getText().equals("Password")) {
//                    Toast.makeText(LoginActivity.this, "You have been loged in .", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(LoginActivity.this, "Wrong credentials.'", Toast.LENGTH_SHORT).show();
//                }
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}