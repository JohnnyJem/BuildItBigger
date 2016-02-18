package com.johnnymolina.gradle.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainJokeActivity extends AppCompatActivity {
    private TextView jokeText;
    String stringExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_main);

        jokeText = (TextView) findViewById(R.id.joke_text);

        stringExtra = getIntent().getStringExtra("joke");

        if (stringExtra != null) {
           jokeText.setText(stringExtra);
        } else {
            // Do something else
        }

    }
}
