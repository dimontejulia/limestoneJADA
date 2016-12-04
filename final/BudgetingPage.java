package com.balant.diana.jada;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.balant.diana.jada.MainActivity.Groceries;
import static com.balant.diana.jada.MainActivity.foodandDining;
import static com.balant.diana.jada.MainActivity.rentandHouse;
import static com.balant.diana.jada.MainActivity.treatYoSelf;
import static com.balant.diana.jada.MainActivity.total;
/**
 * Created by Diana on 2016-12-03.
 */

public class BudgetingPage extends AppCompatActivity {

    private static SeekBar seek_bar;

    private static SeekBar seek_bar2;
    private static SeekBar seek_bar3;
    private static SeekBar seek_bar4;
    private static TextView textView1;
    private static TextView textView2;
    private static TextView textView3;
    private static TextView textView4;
    private static TextView text_view;

    double totalBudget; //= total.getTotal();
    double  groceries = Groceries.getTotal();
    double  food = foodandDining.getTotal();
    double  rent = rentandHouse.getTotal();
    double  treat = treatYoSelf.getTotal();

    public static final String TAG = BudgetingPage.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budgeting_page);
        BudgetingBar();
        Log.v(TAG, "onCreate");
        text_view.setText("Budget per Month $"+ Double.toString(total.getTotal()));
        seek_bar.setProgress((int)groceries);
        seek_bar2.setProgress((int)food);
        seek_bar3.setProgress((int)rent);
        seek_bar4.setProgress((int)treat);
    }

    public void BudgetingBar(){
        seek_bar = (SeekBar)findViewById(R.id.seek_bar);
        seek_bar2 = (SeekBar)findViewById(R.id.seek_bar2);
        seek_bar3 = (SeekBar)findViewById(R.id.seek_bar3);
        seek_bar4 = (SeekBar)findViewById(R.id.seek_bar4);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        text_view = (TextView) findViewById(R.id.text_view);

        //final int total_money = (seek_bar.getProgress() + seek_bar2.getProgress() + seek_bar3.getProgress() + seek_bar4.getProgress());
        //text_view.setText("Total Money Per Month: $" + total_money);


        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value1 = (int)Groceries.getTotal();
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value1 = progress;
                        textView1.setText("$" + (progress_value1 )+" ");
                        groceries = progress;
                        Groceries.newBudget(groceries);
                        //total.addToTotal(groceries);
                        totalBudget = groceries + food + rent + treat;
                        total.newBudget(totalBudget);
                        text_view.setText("Budget per Month $"+ Double.toString(total.getTotal()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar){
                    }
                }
        );

        seek_bar2.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value2 = (int)foodandDining.getTotal();
                    @Override
                    public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
                        progress_value2 = progress;
                        textView2.setText("$" + (progress_value2 )+" ");
                        food = progress;
                        foodandDining.newBudget(food);
                        totalBudget = groceries + food + rent + treat;
                        total.newBudget(totalBudget);
                        text_view.setText("Budget per Month $"+Double.toString(total.getTotal()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar2) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar2) {

                    }
                }
        );

        seek_bar3.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value3 = (int)rentandHouse.getTotal();
                    @Override
                    public void onProgressChanged(SeekBar seekBar3, int progress, boolean fromUser) {
                        progress_value3 = progress;
                        textView3.setText("$" + (progress_value3 )  +" ");
                        rent = progress;
                        rentandHouse.newBudget(rent);
                        //total.addToTotal(rent);
                        totalBudget = groceries + food + rent + treat;
                        total.newBudget(totalBudget);
                        text_view.setText("Budget per Month $"+Double.toString(total.getTotal()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar3) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar3) {

                    }
                }
        );

        seek_bar4.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value4 = (int)treatYoSelf.getTotal();
                    @Override
                    public void onProgressChanged(SeekBar seekBar4, int progress, boolean fromUser) {
                        progress_value4 = progress;
                        textView4.setText("$" +(progress )+" ");
                        treat = progress;
                        treatYoSelf.newBudget(treat);
                        //total.addToTotal(treat);
                        totalBudget = groceries + food + rent + treat;
                        total.newBudget(totalBudget);
                        text_view.setText("Budget per Month $"+Double.toString(total.getTotal()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar4) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar4) {

                    }
                }
        );

        //text_view.setText("Total Money Per Month: $" + total_money);
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.v(TAG, "onResume");
    }

    @Override
    protected void onStart(){
        super.onStart();

        Log.v(TAG, "onStart");
    }

    @Override
    protected void onPause(){
        super.onResume();

        Log.v(TAG, "onPause");
    }

    @Override
    protected void onDestroy(){
        super.onResume();

        Log.v(TAG, "onDestroy");
    }

}
