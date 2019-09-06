package com.example.listviewinnovation;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;


public class DisplayActivity extends Activity {

    private Button buttonClick;
    ToggleButton toggleButton;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);

        buttonClick = (Button) findViewById(R.id.buttonClick);

        buttonClick.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                final Dialog dialog = new Dialog(DisplayActivity.this);
                dialog.setContentView(R.layout.dialog);
                dialog.setTitle("Shiv's Info");
                Intent intent = getIntent();
                String data = intent.getStringExtra("name");



                ImageView image = (ImageView) dialog.findViewById(R.id.image);

//                Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
//                image.startAnimation(aniRotate);
                switch (data) {
                    case "Sanket":
//                        mp3=MediaPlayer.create(getApplicationContext(),);
                        Toast.makeText(DisplayActivity.this, "Hello " + data, Toast.LENGTH_SHORT).show();
                        image.setImageResource(R.drawable.sanket);
                        ObjectAnimator animation = ObjectAnimator.ofFloat(image, "translationY", 100f);
                        animation.setDuration(2000);
                        animation.start();

                        break;
                    case "Shiv":
                        Toast.makeText(DisplayActivity.this, "Hello " + data, Toast.LENGTH_SHORT).show();
                        image.setImageResource(R.drawable.shiv);
                        ObjectAnimator animation2 = ObjectAnimator.ofFloat(image, "translationX", 100f);
                        animation2.setDuration(2000);
                        animation2.start();

                        break;
                    case "Shubham":
                        Toast.makeText(DisplayActivity.this, "Hello " + data, Toast.LENGTH_SHORT).show();
                        image.setImageResource(R.drawable.shubham);
                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(image, "translationX", 100f);
                        animation3.setDuration(2000);
                        animation3.start();

                        break;
                    case "Saish":
                        Toast.makeText(DisplayActivity.this, "Hello " + data, Toast.LENGTH_SHORT).show();
                        image.setImageResource(R.drawable.saish);
                        ObjectAnimator animation4 = ObjectAnimator.ofFloat(image, "translationY", 100f);
                        animation4.setDuration(2000);
                        animation4.start();

                        break;
                }
                dialog.show();
                Button backButton = (Button) dialog.findViewById(R.id.back);
                backButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent backIntent = new Intent(DisplayActivity.this, MainActivity.class);
                        startActivity(backIntent);
                    }
                });
            }
        });
    }
}