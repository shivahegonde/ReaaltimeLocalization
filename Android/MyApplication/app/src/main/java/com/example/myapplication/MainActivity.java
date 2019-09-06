package com.example.myapplication;

import android.app.Dialog;
import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2;
    TextView res;
    Button addButton,subButton,mulButton,divButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1=findViewById(R.id.no1);
        no2=findViewById(R.id.no2);
        res=findViewById(R.id.result);
        addButton=findViewById(R.id.addition);
        subButton=findViewById(R.id.subtraction);
        mulButton=findViewById(R.id.multiplication);
        divButton=findViewById(R.id.division);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(String.valueOf(no1.getText()));
                int number2=Integer.parseInt(String.valueOf(no2.getText()));
                String result=String.valueOf(res.getText());
                res.setText(result+(number1-number2));
                Toast.makeText(MainActivity.this, "No1 : "+number1+"\nNo2 : "+number2, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Subtraction is: "+(number1-number2), Toast.LENGTH_SHORT).show();
            }
        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(String.valueOf(no1.getText()));
                int number2=Integer.parseInt(String.valueOf(no2.getText()));
                String result=String.valueOf(res.getText());
                res.setText(result+(number1*number2));
                Toast.makeText(MainActivity.this, "No1 : "+number1+"\nNo2 : "+number2, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Multiplication is: "+(number1*number2), Toast.LENGTH_SHORT).show();
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(String.valueOf(no1.getText()));
                int number2=Integer.parseInt(String.valueOf(no2.getText()));
                String result=String.valueOf(res.getText());
                res.setText(result+(number1/number2));
                Toast.makeText(MainActivity.this, "No1 : "+number1+"\nNo2 : "+number2, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Division is: "+(number1/number2), Toast.LENGTH_SHORT).show();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(String.valueOf(no1.getText()));
                int number2=Integer.parseInt(String.valueOf(no2.getText()));
                String result=String.valueOf(res.getText());
                res.setText(result+" "+(number1+number2));
                Toast.makeText(MainActivity.this, "No1 : "+number1+"\nNo2 : "+number2, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Addition is: "+(number1+number2), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
