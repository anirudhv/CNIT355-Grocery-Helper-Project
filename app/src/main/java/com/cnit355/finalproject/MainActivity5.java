package com.cnit355.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    Spinner spinner;
    TextView calories;
    String[] Recipes = new String[] { "Select a Recipe", "Lasagna Flatbread", "Sloppy Joe", "Mac and Cheese", "Chicken Thai Curry", "Stuffing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        spinner=(Spinner)findViewById(R.id.spinner2);
        final TextView calories=(TextView)findViewById(R.id.CalorieInput);
        final TextView Ingredients=(TextView)findViewById(R.id.IngredientsInput);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Recipes);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);

    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            String Meal=(Recipes[i]);
            if(Meal=="Select a Recipe"){
                calories.setText("");
                Ingredients.setText("");


            }
            if(Meal=="Lasagna Flatbread"){
                calories.setText("620");
                Ingredients.setText("Mozzarella Cheese, Parm Cheese, Egg, Italian Seasoning, Sausage, Marinara Sauce, Flatbread");

            }
            if(Meal=="Sloppy Joe"){
                calories.setText("371");
                Ingredients.setText("Onions, Ground Beef, Bell Pepper, Ketchup, BBQ Sauce, Garlic");

            }
            if(Meal=="Mac and Cheese"){
                calories.setText("310");
                Ingredients.setText("Macaroni, Butter, Flour, Salt, Milk, Cheddar Cheese");

            }
            if(Meal=="Chicken Thai Curry"){
                calories.setText("354");
                Ingredients.setText("Coconut Oil, Boneless Chicken Breasts, Coconut Cream, Red Thai Curry Sauce, Rice");

            }
            if(Meal=="Stuffing"){
                calories.setText("109");
                Ingredients.setText("Butter, White Bread, Onions, Celery, Salt, Black Pepper");

            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });

    }
    public void FourthActivity(View view){
        Intent mIntent = new Intent(this, MainActivity4.class);
        startActivity(mIntent);
    }
    public void SecondActivity(View view){
        Intent mIntent = new Intent(this, MainActivity2.class);
        startActivity(mIntent);
    }
    public void ThirdActivity(View view){
        Intent mIntent = new Intent(this, MainActivity3.class);
        startActivity(mIntent);
    }

}
