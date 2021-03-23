package com.example.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] pythonArray = {"Introduction","First Program in Python",
            "Variable","Keyword","User Input in Python","Operator","Data Type","Comments","If","If Else","If Else Laddar",
            "Nested If","For Loop","While Loop","Jump Statement","Lists","List Function","Sets","Tuples","Tuples Function","Dictionaries",
            "Dictionary Method","String","String Method","Function","Math Function","Date and Time"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressDialog pd = new ProgressDialog(this);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,pythonArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                    if (i == 0)
                    {
                        Intent intent  = new Intent(MainActivity.this, Introduction.class);
                        startActivity(intent);


                    }
                    if (i == 1)
                    {
                        Intent intent = new Intent(MainActivity.this,Program_one.class);
                        startActivity(intent);

                    } if (i == 2)
                    {
                        Intent intent = new Intent(MainActivity.this,Program_two.class);
                        startActivity(intent);
                    }if (i == 3)
                    {
                        Intent intent = new Intent(MainActivity.this,Program_three.class);
                        startActivity(intent);
                    }
                    if (i == 4)
                    {
                        Intent intent = new Intent(MainActivity.this,Program_four.class);
                        startActivity(intent);
                     }
                    if (i == 5)
                    {
                        Intent intent = new Intent(MainActivity.this,Program_five.class);
                        startActivity(intent);
                    }
                    if (i == 6)
                    {
                        Intent intent = new Intent(MainActivity.this,Program_five.class);
                        startActivity(intent);
                    }



                }

        });
    }
}