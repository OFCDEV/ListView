package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView) findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Sibu");
        myFamily.add("Simi");
        myFamily.add("Mama");
        myFamily.add("Baba");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter); //This is how we can add context in our app

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long d) {
                Log.i("person tapped:", myFamily.get(position));
                Toast.makeText(getApplicationContext(),"Hello " +myFamily.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }
}