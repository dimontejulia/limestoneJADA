package com.balant.diana.jada;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.balant.diana.jada.MainActivity.Groceries;
import static com.balant.diana.jada.MainActivity.foodandDining;
import static com.balant.diana.jada.MainActivity.rentandHouse;
import static com.balant.diana.jada.MainActivity.treatYoSelf;
/**
 * Created by Diana on 2016-12-03.
 */

public class ViewActivity extends AppCompatActivity {

    TextView txtAmtGroceries;
    TextView txtAmtFood;
    TextView txtAmtRent;
    TextView txtAmtTreat;

    ProgressBar progGroceries;
    ProgressBar progFood;
    ProgressBar progRent;
    ProgressBar progTreat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        txtAmtGroceries = (TextView) findViewById(R.id.txtAmtGroceries);
        String grocTotal = Double.toString(Groceries.getTotal());
        String grocSpent = Double.toString(Groceries.getAmtSpent());
        txtAmtGroceries.setText("$" + grocSpent + "/$" + grocTotal);

        progGroceries = (ProgressBar) findViewById(R.id.progGroceries);
        int progGroc = (int)Groceries.percentSpent();
        progGroceries.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        progGroceries.setProgress(progGroc);

        if(Groceries.getAmtSpent() >= Groceries.getTotal()){
            progGroceries.setProgressTintList(ColorStateList.valueOf(Color.RED));//.getIndeterminateDrawable().setColorFilter();
        }


        txtAmtFood = (TextView) findViewById(R.id.txtAmtFood);
        String foodTotal = Double.toString(foodandDining.getTotal());
        String foodSpent = Double.toString(foodandDining.getAmtSpent());
        txtAmtFood.setText("$" + foodSpent + "/$" + foodTotal);

        progFood = (ProgressBar) findViewById(R.id.progFood);
        int progFD = (int)foodandDining.percentSpent();
        progFood.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        progFood.setProgress(progFD);

        if(foodandDining.getAmtSpent() >= foodandDining.getTotal()){
            progFood.setProgressTintList(ColorStateList.valueOf(Color.RED));//.getIndeterminateDrawable().setColorFilter();
        }


        txtAmtRent = (TextView) findViewById(R.id.txtAmtRent);
        String rentTotal = Double.toString(rentandHouse.getTotal());
        String rentSpent = Double.toString(rentandHouse.getAmtSpent());
        txtAmtRent.setText("$" + rentSpent + "/$" + rentTotal);

        progRent = (ProgressBar) findViewById(R.id.progRent);
        int progR = (int)rentandHouse.percentSpent();
        progRent.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        progRent.setProgress(progR);

        if(rentandHouse.getAmtSpent() >= rentandHouse.getTotal()){
            progRent.setProgressTintList(ColorStateList.valueOf(Color.RED));//.getIndeterminateDrawable().setColorFilter();
        }



        txtAmtTreat = (TextView) findViewById(R.id.txtAmtTreat);
        String treatTotal = Double.toString(treatYoSelf.getTotal());
        String treatSpent = Double.toString(treatYoSelf.getAmtSpent());
        txtAmtTreat.setText("$" + treatSpent + "/$" + treatTotal);

        progTreat = (ProgressBar) findViewById(R.id.progTreat);
        int progT = (int)treatYoSelf.percentSpent();
        progTreat.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        progTreat.setProgress(progT);

        if(treatYoSelf.getAmtSpent() >= treatYoSelf.getTotal()){
           progTreat.setProgressTintList(ColorStateList.valueOf(Color.RED));//.getIndeterminateDrawable().setColorFilter();
        }
    }
}
