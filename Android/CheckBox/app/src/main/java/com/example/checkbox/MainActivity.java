package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import static com.example.checkbox.R.*;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cb, cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        cb = findViewById(id.cb);
        cb1 = findViewById(id.cb1);
        cb2 = findViewById(id.cb2);
        cb3 = findViewById(id.cb3);
        cb.setOnCheckedChangeListener(this);
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);


       /* cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
onClick();
            }
        });
    }
        public void onClick(){
        if (cb.isChecked()){
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "hii unclicked", Toast.LENGTH_SHORT).show();
        }
        }
}


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }*/
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.cb:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            case id.cb1:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            case id.cb2:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                break;
            case id.cb3:
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}