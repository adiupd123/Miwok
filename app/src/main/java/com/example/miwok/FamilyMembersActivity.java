package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
    }

    public void openMainActivity2(View view){
        Intent i = new Intent(FamilyMembersActivity.this, MainActivity.class);
        FamilyMembersActivity.this.startActivity(i);
    }
}