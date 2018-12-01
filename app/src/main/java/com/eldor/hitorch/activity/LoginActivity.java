package com.eldor.hitorch.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.eldor.hitorch.R;

public class LoginActivity extends AppCompatActivity {

    private EditText email_;
    private EditText password_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email_ = findViewById(R.id.email);
        password_ = findViewById(R.id.pwd);
    }


    public void check_login(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
