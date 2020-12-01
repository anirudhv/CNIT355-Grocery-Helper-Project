package com.cnit355.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void FifthActivity(View view){
        Intent mIntent = new Intent(this, MainActivity5.class);
        startActivity(mIntent);
    }
    public void SecondActivity(View view){
        Intent mIntent = new Intent(this, MainActivity2.class);
        startActivity(mIntent);
    }
}