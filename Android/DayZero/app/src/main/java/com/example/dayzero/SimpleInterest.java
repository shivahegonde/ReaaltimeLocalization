package com.example.dayzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleInterest extends AppCompatActivity {
    EditText years,rates,principles;
    AppCompatButton interest;
    static double simpleInterest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        years=findViewById(R.id.year);
        rates=findViewById(R.id.rate);
        principles=findViewById(R.id.principle);
        interest=findViewById(R.id.calculateInterest);
        interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p=Integer.parseInt(String.valueOf(principles.getText()));
                int r=Integer.parseInt(String.valueOf(rates.getText()));
                int n=Integer.parseInt(String.valueOf(years.getText()));
//                Toast.makeText(MainActivity.this, "p "+p+ " n "+n+" r "+r , Toast.LENGTH_SHORT).show();
                if(p==0||n==0||r==0){
                    Toast.makeText(SimpleInterest.this, "You Entered 0 in above fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    simpleInterest=(double) (p * n * r) / 100;
                    Toast.makeText(SimpleInterest.this, "Simple Interest= " + simpleInterest, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
