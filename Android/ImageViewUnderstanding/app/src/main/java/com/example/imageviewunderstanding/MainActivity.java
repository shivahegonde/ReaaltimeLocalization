package com.example.imageviewunderstanding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageButton imageButton;
    Intent intent;
    int clicknode = 100;
    Bitmap bitmap;
    Button wallpaperButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputStream inputStream=getResources().openRawResource(R.drawable.shiv);
        bitmap= BitmapFactory.decodeStream(inputStream);

        imageView = findViewById(R.id.imageView);
        imageButton = findViewById(R.id.imageButton);
        wallpaperButton=findViewById(R.id.wallpaper);
        wallpaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    getApplicationContext().setWallpaper(bitmap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent, clicknode);
                Toast.makeText(MainActivity.this, "Camera Button Clicked...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Bundle bundleNew=data.getExtras();
            bitmap=(Bitmap) bundleNew.get("data");
            imageView.setImageBitmap(bitmap);

        }
    }

}
