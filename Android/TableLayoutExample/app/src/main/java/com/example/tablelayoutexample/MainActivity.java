package com.example.tablelayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText;
RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        ratingBar=findViewById(R.id.ratings);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String s1=editText.getText().toString();
                float ratingValue=ratingBar.getRating();
                Toast.makeText(MainActivity.this, "Movie" + s1+" "+"Ratings= "+ratingValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
