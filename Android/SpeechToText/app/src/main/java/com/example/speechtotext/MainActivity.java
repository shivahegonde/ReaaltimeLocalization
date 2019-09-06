package com.example.speechtotext;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognitionService;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView voiceTextView, speakTextView;
    final int REQ_CODE_SPEECH_INPUT = 100;
    int STORAGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        voiceTextView = findViewById(R.id.voiceInput);
        speakTextView = findViewById(R.id.speak);
        speakTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bolnahalkehalke();
            }
        });

    }

    private void bolnahalkehalke() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hi Speak quick Please");
        try {
            startActivityForResult(intent, 123);
        } catch (ActivityNotFoundException a) {

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        switch (requestCode) {
            case 123:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    voiceTextView.setText(result.get(4));
                }
                break;

        }
    }
}
