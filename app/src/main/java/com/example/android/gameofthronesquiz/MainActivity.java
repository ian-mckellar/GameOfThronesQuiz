package com.example.android.gameofthronesquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    private TextView scoreTextView;
    private CheckBox q2AnswerB;
    private CheckBox q2AnswerD;
    private RadioButton question3Answer;
    private RadioButton question4Answer;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTextView = (TextView) findViewById(R.id.text_view_score);
        q2AnswerB = (CheckBox) findViewById(R.id.q_2_answer_b);
        q2AnswerD = (CheckBox) findViewById(R.id.q_2_answer_d);
        question3Answer = (RadioButton) findViewById(R.id.q_3_answer_b);
        question4Answer = (RadioButton) findViewById(R.id.q_4_answer_c);
        finishButton = (Button) findViewById(R.id.button_finish);

    }

    public void submit(View view) {
        // right answer

        if (q2AnswerB.isChecked() && q2AnswerD.isChecked()) {
            score += 1;
        }

        if (question3Answer.isChecked()) {
            score += 1;
        }

        if (question4Answer.isChecked()) {
            score += 1;
        }

        finishButton.setEnabled(false);

        displayScore(score);
    }

    public void displayScore(int score) {
        scoreTextView.setText("Score: " + score);
    }
}
