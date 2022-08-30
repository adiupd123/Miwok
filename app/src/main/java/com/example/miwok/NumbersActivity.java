package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
    }

    public void openMainActivity1(View view){
        Intent i = new Intent(NumbersActivity.this, MainActivity.class);
        NumbersActivity.this.startActivity(i);
    }
}