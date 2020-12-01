package com.cnit355.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void FifthActivity(View view){
        Intent mIntent = new Intent(this, MainActivity5.class);
        startActivity(mIntent);
    }
    public void ThirdActivity(View view){
        CheckBox meal1 = (CheckBox)findViewById(R.id.meal1);
        CheckBox meal2 = (CheckBox)findViewById(R.id.meal2);
        CheckBox meal3 = (CheckBox)findViewById(R.id.meal3);
        CheckBox meal4 = (CheckBox)findViewById(R.id.meal4);
        CheckBox meal5 = (CheckBox)findViewById(R.id.meal5);
        Intent mIntent = new Intent(this, MainActivity3.class);
        mIntent.putExtra("meal1", meal1.isChecked());
        mIntent.putExtra("meal2", meal2.isChecked());
        mIntent.putExtra("meal3", meal3.isChecked());
        mIntent.putExtra("meal4", meal4.isChecked());
        mIntent.putExtra("meal5", meal5.isChecked());
        startActivity(mIntent);
    }
    public void FourthActivity(View view){
        Intent mIntent = new Intent(this, MainActivity4.class);
        startActivity(mIntent);
    }

}