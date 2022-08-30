package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
    }

    public void openMainActivity4(View view){
        Intent i = new Intent(PhrasesActivity.this, MainActivity.class);
        PhrasesActivity.this.startActivity(i);
    }
}