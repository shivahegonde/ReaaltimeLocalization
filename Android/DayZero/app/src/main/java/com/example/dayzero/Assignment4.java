package com.example.dayzero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Assignment4 extends AppCompatActivity {
    EditText no;
    TextView op;
    Button hex,bactButton,backToMainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment_4);
        no=findViewById(R.id.no);
        op=findViewById(R.id.output);
        hex=findViewById(R.id.dectohex);
        bactButton=findViewById(R.id.back);
        backToMainButton=findViewById(R.id.backtomain);

        hex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Assignment4.this, "Size: "+no.getTextSize(), Toast.LENGTH_SHORT).show();
                if(no.length()>6){
                    op.setText("No is too large..");
                }
                else {
                    String output = Integer.toHexString(Integer.parseInt(String.valueOf(no.getText()))).toUpperCase();
                    op.setText("Hexadecimal number is : " + output);
                }
            }
        });
        bactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Assignment4.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
