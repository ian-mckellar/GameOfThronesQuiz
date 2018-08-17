package com.example.android.gameofthronesquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score;

    private TextView scoreTextView;
    private CheckBox q2AnswerB;
    private CheckBox q2AnswerD;
    private RadioButton q3Answer;
    private RadioButton q4Answer;
    private Button finishButton;
    private EditText q1String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTextView = (TextView) findViewById(R.id.text_view_score);
        q1String = (EditText) findViewById(R.id.who_betrayed_ned_stark);
        q2AnswerB = (CheckBox) findViewById(R.id.q_2_answer_b);
        q2AnswerD = (CheckBox) findViewById(R.id.q_2_answer_d);
        q3Answer = (RadioButton) findViewById(R.id.q_3_answer_b);
        q4Answer = (RadioButton) findViewById(R.id.q_4_answer_c);
        finishButton = (Button) findViewById(R.id.button_finish);


        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String q1AnswerString = q1String.getText().toString();
                q1AnswerString = q1AnswerString.toLowerCase();

                if (q1AnswerString.equals("littlefinger")
                        || q1AnswerString.equals("little finger")
                        || q1AnswerString.equals("peter baelish")) {
                    score++;
                } else {
                    score--;
                }

                if (q2AnswerB.isChecked() && q2AnswerD.isChecked()) {
                    score++;
                } else {
                   score--;
                }

                if (q3Answer.isChecked()) {
                    score++;
                } else {
                    score--;
                }

                if (q4Answer.isChecked()) {
                    score++;
                } else {
                    score--;
                }

                finishButton.setEnabled(false);

                Bundle extras = new Bundle();
                extras.putInt("score", score);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}
