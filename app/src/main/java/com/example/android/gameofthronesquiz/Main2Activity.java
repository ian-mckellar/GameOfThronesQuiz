package com.example.android.gameofthronesquiz;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textViewScoreToDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        int score = extras.getInt("score");

        textViewScoreToDisplay = (TextView) findViewById(R.id.text_view_score_to_display);
        Resources resource = getResources();
        String scoreText = resource.getString(R.string.score, score);
        textViewScoreToDisplay.setText(scoreText);


    }
}
