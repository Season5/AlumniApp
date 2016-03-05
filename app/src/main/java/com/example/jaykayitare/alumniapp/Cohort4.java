package com.example.jaykayitare.alumniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cohort4 extends AppCompatActivity {
    String[] names = {"Diana Omondi","James Omondi","Ian Omondi","John Omondi","Diana Omondi","James Omondi","Ian Omondi","John Omondi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cohort4);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.listview, names);

        ListView listView = (ListView) findViewById(R.id.listView3);
        listView.setAdapter(adapter);

=======

public class Cohort4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cohort4);
>>>>>>> 98f231e8d5fc3db39e1023a70ec949d5a04e31af
    }
}
