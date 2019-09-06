package com.example.sqllitedatabase;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText rollNo, name, marks;
    Button add, delete, view, viewAll, modify, show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db;
        rollNo = findViewById(R.id.rollnoEdit);
        name = findViewById(R.id.nameEdit);
        marks = findViewById(R.id.nameEdit);
        add = findViewById(R.id.addButton);
        delete = findViewById(R.id.deleteButton);
        modify = findViewById(R.id.modifyButton);
        show = findViewById(R.id.showButton);
        view = findViewById(R.id.viewButton);
        viewAll = findViewById(R.id.viewALlButton);
        add.setOnClickListener(this);
        modify.setOnClickListener(this);
        delete.setOnClickListener(this);
        show.setOnClickListener(this);
        view.setOnClickListener(this);
        viewAll.setOnClickListener(this);
        db = openOrCreateDatabase("StudentDB", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.addButton:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.modifyButton:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.showButton:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.deleteButton:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.viewButton:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.viewALlButton:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
