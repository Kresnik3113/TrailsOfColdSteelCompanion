package com.example.trailsofcoldsteelcompanion;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


public class Chapters extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        String string = bundle.getString("string");

        //if statments that open the approprita layout depening on what the user clicks
        if (string.equals("prologue")){
            getSupportActionBar().setTitle("Prologue");
            setContentView(R.layout.activity_chapter);

        }
        else if(string.equals("c1")){
            getSupportActionBar().setTitle("Chapter 1");
            setContentView(R.layout.activity_chapter1);
        }
        else if(string.equals("c2")){
            getSupportActionBar().setTitle("Chapter 2");
            setContentView(R.layout.activity_chapter2);
        }
        else if(string.equals("c3")){
            getSupportActionBar().setTitle("Chapter 3");
            setContentView(R.layout.activity_chapter3);
        }
        else if(string.equals("c4")){
            getSupportActionBar().setTitle("Chapter 4");
            setContentView(R.layout.activity_chapter4);
        }
        else if(string.equals("c5")){
            getSupportActionBar().setTitle("Chapter 5");
            setContentView(R.layout.activity_chapter5);
        }
        else if(string.equals("c6")){
            getSupportActionBar().setTitle("Chapter 6");
            setContentView(R.layout.activity_chapter6);
        }
        else if(string.equals("fc")){
            getSupportActionBar().setTitle("Final Chapter ");
            setContentView(R.layout.activity_finalchapter);
        }




    }
}
