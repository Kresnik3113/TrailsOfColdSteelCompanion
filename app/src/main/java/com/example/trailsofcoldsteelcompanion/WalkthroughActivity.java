package com.example.trailsofcoldsteelcompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WalkthroughActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);
        getSupportActionBar().setTitle("Walkthrough");
        final Bundle bundle= new Bundle();
        final String p="prologue";
        final String c1="c1";
        final String c2="c2";
        final String c3="c3";
        final String c4="c4";
        final String c5="c5";
        final String c6="c6";
        final String fc="fc";
        final Button button1 = findViewById(R.id.Prologue);
        final Button button2 = findViewById(R.id.Chapter1);
        final Button button3 = findViewById(R.id.Chapter2);
        final Button button4 = findViewById(R.id.Chapter3);
        final Button button5 = findViewById(R.id.Chapter4);
        final Button button6 = findViewById(R.id.Chapter5);
        final Button button7 = findViewById(R.id.Chapter6);
        final Button button8 = findViewById(R.id.FinalChapter);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",p);
                i.putExtras(bundle);
                startActivity(i);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",c1);
                i.putExtras(bundle);
                startActivity(i);


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",c2);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",c3);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",c4);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",c5);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",c6);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chapters.class);
                bundle.putString("string",fc);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
    }

}