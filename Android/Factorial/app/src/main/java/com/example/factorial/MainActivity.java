package com.example.factorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.editText);
        factorial=findViewById(R.id.button);
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  no=Integer.parseInt(String.valueOf(number.getText()));
                int fact=1;
                for (int i = 1; i <= no; i++) {
                    fact=fact*i;
                }
                Toast.makeText(MainActivity.this, "Factorial is: "+fact, Toast.LENGTH_LONG).show();
            }
        });
    }
}
