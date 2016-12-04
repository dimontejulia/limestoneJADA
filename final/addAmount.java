package com.balant.diana.jada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.balant.diana.jada.MainActivity.Groceries;
import static com.balant.diana.jada.MainActivity.foodandDining;
import static com.balant.diana.jada.MainActivity.rentandHouse;
import static com.balant.diana.jada.MainActivity.treatYoSelf;
import static com.balant.diana.jada.MainActivity.total;

/**
 * Created by Diana on 2016-12-03.
 */

public class addAmount extends Activity {
    Button addGroceries;
    Button addRent;
    Button addFood;
    Button addTreat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_amount);

        addGroceries = (Button) findViewById(R.id.addGroceries);
        addFood = (Button) findViewById(R.id.addFood);
        addRent = (Button) findViewById(R.id.addRent);
        addTreat = (Button) findViewById(R.id.addTreat);
    }

    public void getGroceries(View V) {
        Intent intent= new Intent(this, addPurchase.class);
        startActivityForResult(intent, 1);
    }


    public void getFood(View V) {
        Intent intent= new Intent(this, addPurchase.class);
        startActivityForResult(intent, 2);
    }


    public void getRent(View V){
        Intent intent= new Intent(this, addPurchase.class);
        startActivityForResult(intent, 3);

    }

    public void getTreat(View V) {
        Intent intent= new Intent(this, addPurchase.class);
        startActivityForResult(intent, 4);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data ) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            String message = data.getStringExtra("Message");
            Groceries.add(Double.parseDouble(message));
            total.add(Double.parseDouble(message));
        }
        if (requestCode == 2) {
            String message = data.getStringExtra("Message");
            foodandDining.add(Double.parseDouble(message));
            total.add(Double.parseDouble(message));
        }
        if (requestCode == 3) {
            String message = data.getStringExtra("Message");
            rentandHouse.add(Double.parseDouble(message));
            total.add(Double.parseDouble(message));
        }
        if (requestCode == 4) {
            String message = data.getStringExtra("Message");
            treatYoSelf.add(Double.parseDouble(message));
            total.add(Double.parseDouble(message));
        }
    }


}
