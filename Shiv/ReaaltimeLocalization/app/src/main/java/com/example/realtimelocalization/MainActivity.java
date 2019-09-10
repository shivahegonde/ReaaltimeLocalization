package com.example.realtimelocalization;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.util.LocaleData;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import com.example.reaaltimelocalization.R;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button changeLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        changeLanguage = findViewById(R.id.changelang);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.app_name));

        changeLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showChangeLanguageDialog();
            }
        });
    }

    private void showChangeLanguageDialog() {
        final String[] languages = {"English", "मराठी", "ಕಂದ"};
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Change Language");
        builder.setSingleChoiceItems(languages, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    setLocale("En");
                    recreate();
                } else if (i == 1) {
                    setLocale("Mr");
                    recreate();
                } else if (i == 2) {
                    setLocale("Kn");
                    recreate();
                }
                dialogInterface.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void setLocale(String lang) {
        switch (lang) {
            case "En":
                Locale locale = new Locale("en");
                Locale.setDefault(locale);
                Configuration configuration=new Configuration();
                configuration.locale=locale;
                getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
//                SharedPreferences.Editor editor=getSharedPreferences("Settings",MODE_PRIVATE).edit();
//                editor.putString("My_Languages",lang);
//                editor.apply();

                break;
            case "Mr":
                Locale locale1 = new Locale("mr");
                Locale.setDefault(locale1);
                Configuration configuration1=new Configuration();
                configuration1.locale=locale1;
                getBaseContext().getResources().updateConfiguration(configuration1,getBaseContext().getResources().getDisplayMetrics());
                break;
            case "Kn":
                Locale locale2 = new Locale("kn");
                Locale.setDefault(locale2);
                Configuration configuration2=new Configuration();
                configuration2.locale=locale2;
                getBaseContext().getResources().updateConfiguration(configuration2,getBaseContext().getResources().getDisplayMetrics());
                break;
        }

    }
}
