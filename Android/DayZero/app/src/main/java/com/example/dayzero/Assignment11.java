package com.example.dayzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assignment11 extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button pen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment_11);
        editText=findViewById(R.id.inputs);
        pen=findViewById(R.id.penultimate);
        textView=findViewById(R.id.show);
        pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string=String.valueOf(editText.getText());
                String[] input=string.split(" ");
                if(input.length<=1){
                    textView.setText("Sorry! You entered only one element.");
                }
                for (int i = 0; i < input.length-1; i++) {
                    textView.setText(" " +input[i]);
                }
            }
        });

    }
}

