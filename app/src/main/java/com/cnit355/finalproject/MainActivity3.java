package com.cnit355.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView listView=(ListView)findViewById(R.id.listview);
        Boolean check1 = getIntent().getExtras().getBoolean("meal1");
        Boolean check2 = getIntent().getExtras().getBoolean("meal2");
        Boolean check3 = getIntent().getExtras().getBoolean("meal3");
        Boolean check4 = getIntent().getExtras().getBoolean("meal4");
        Boolean check5 = getIntent().getExtras().getBoolean("meal5");
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        if (check1){
            arrayList.add("Mozzarella");
            arrayList.add("Cheese");
            arrayList.add("Parm Cheese");
            arrayList.add("Egg");
            arrayList.add("Italian Seasoning");
            arrayList.add("Sausage");
            arrayList.add("Marinara Sauce");
            arrayList.add("Flatbread");
        }
        if (check2){
            arrayList.add("Ground Beef");
            arrayList.add("Bell pepper");
            arrayList.add("Ketchup");
            arrayList.add("Bbq Sauce");
            arrayList.add("Garlic");
        }

        if (check3){
            arrayList.add("Macaroni");
            arrayList.add("Butter");
            arrayList.add("Flour");
            arrayList.add("Salt");
            arrayList.add("Milk");
            arrayList.add("Cheddar Cheese");

        }
        if (check4){
            arrayList.add("Coconut Oil");
            arrayList.add("Boneless chicken breasts");
            arrayList.add("Coconut cream");
            arrayList.add("Red thai Curry Sauce");
            arrayList.add("Rice");
        }
        if (check5){
            arrayList.add("Butter");
            arrayList.add("White bread");
            arrayList.add("Onion");
            arrayList.add("Celery");
            arrayList.add("Salt");
            arrayList.add("Black Pepper");


        }
    }
    public void FifthActivity(View view){
        Intent mIntent = new Intent(this, MainActivity5.class);
        startActivity(mIntent);
    }
    public void SecondActivity(View view){
        Intent mIntent = new Intent(this, MainActivity2.class);
        startActivity(mIntent);
    }
    public void FourthActivity(View view){
        Intent mIntent = new Intent(this, MainActivity4.class);
        startActivity(mIntent);
    }
}