package com.example.alicesantilli.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class addPurchase extends AppCompatActivity {

    Button addPurchase;
    EditText amountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_add_purchase);

        amountText = (EditText) findViewById(R.id.amountText);

        addPurchase = (Button) findViewById(R.id.addPurchase);
    }
//        addPurchase.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


    public void submitMessage(View V) {
        String message = amountText.getText().toString();
        Intent intentMessage= new Intent();

        intentMessage.putExtra("Message", message);
        setResult(2, intentMessage);
        finish();
    }
}
