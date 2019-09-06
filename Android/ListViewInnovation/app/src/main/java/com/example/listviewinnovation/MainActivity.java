package com.example.listviewinnovation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.team_members);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = adapter.getItem(position);
                switch (value) {
                    case "Shiv":
                        Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                        intent.putExtra("name", value);
                        startActivity(intent);
                        break;
                    case "Sanket":
                        Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                        intent.putExtra("name", value);
                        startActivity(intent);
                        break;
                    case "Shubham":
                        Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                        intent.putExtra("name", value);
                        startActivity(intent);
                        break;
                    case "Saish":
                        Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                        intent.putExtra("name", value);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}