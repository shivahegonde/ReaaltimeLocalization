package com.example.dayzero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dayzero.R;

import java.util.Calendar;
import java.util.Date;

public class Assignment9 extends Activity {
    Button button,backButton;
    TextView textView;
    Date date=java.util.Calendar.getInstance().getTime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment_9);
        button=findViewById(R.id.show);
        backButton=findViewById(R.id.back);
        textView=findViewById(R.id.datetime);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newDate=date.toString();
                String newDate1="";
                for(int i=0;i<19;i++){
                    newDate1=newDate1+newDate.charAt(i);
                }

                textView.setText("Current Date time: "+newDate1);
            }
        });

        // date.setTime(System.currentTimeMillis()); //set to current time
        // dateButton.setText(date.toString());
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Assignment9.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
