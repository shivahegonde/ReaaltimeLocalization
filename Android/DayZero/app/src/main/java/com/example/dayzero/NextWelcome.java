package com.example.dayzero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextWelcome extends AppCompatActivity {
Button backToMainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_welcome);
        backToMainButton=findViewById(R.id.backtomain);
        backToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NextWelcome.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
