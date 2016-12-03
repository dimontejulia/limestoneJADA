package com.example.ashley.jada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView grocTips;
    TextView treatTips;
    TextView foodTips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grocTips = (TextView) findViewById(R.id.grocTips);
        
        if (Groceries.percentSpent() < .5) {
            grocTips.setText("- You still have spent under half of your Grocery budget.");
        } else if (Groceries.percentSpent() > .5)  {
            grocTips.setText("- You've reached over half your grocery budget!");
        } else if (1 > Groceries.percentSpent() > .9) {
            grocTips.setText("- You've spent over 85% of your grocery budget!");
        } else if (Groceries.percentSpent() > 1) {
            grocTips.setText("You've exceeded your grocery budget for this month!");
        }
        

        foodTips = (TextView) findViewById(R.id.foodTips);

        
        if (foodandDining.percentSpent() < .5) {
            foodTips.setText("- You have spent under half of your food and dining budget. ");
        } else if (foodandDining.percentSpent() > .5)  {
            foodTips.setText("- You've reached over half of your food and dining budget! ");
        } else if (1 > foodandDining.percentSpent() > .9) {
            foodTips.setText("- You're over 90% of your food and dining budget! ");
        } else if (foodandDining.percentSpent() > 1) {
            foodTips.setText(" STOP DINING OUT!!");
        }

         treatTips = (TextView) findViewById(R.id.treatTips);
        
        if (treatYoSelf.percentSpent() <.5) {
            treatTips.setText("- You've spent under half of your Treat Yo Self budget, so Treat Yo Self!");
        } else if (treatYoSelf.percentSpent() > .5)  {
            treatTips.setText("- You've spent over half of your Treat Yo Self budget, maybe take it easy. ");
        } else if (1 > treatYoSelf.percentSpent() > .9) {
            treatTips.setText("- You've spent over 90% of your Treat Yo Self Budget, pls stop treating yourself");
        } else if (treatYoSelf.percentSpent() > 1) {
            treatTips.setText("- STOP TREATING YOURSELF!!");
        }
        






    }
}

    }
}
