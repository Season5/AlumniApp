package com.example.jaykayitare.alumniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cohort5 extends AppCompatActivity {
    String[] names = {"Diana Omondi","James Omondi","Ian Omondi","John Omondi","Diana Omondi","James Omondi","Ian Omondi","John Omondi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cohort5);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.listview, names);

        ListView listView = (ListView) findViewById(R.id.listView4);
        listView.setAdapter(adapter);


    }
}
