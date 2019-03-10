package com.ron.cranajit.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mQuestionView;
    private Button mFirstAnswer;
    private Button mSecondAnswer;
    private int ButtonValue;
    private int mstoryIndex = 1;

    QuestionsModel question[] = new QuestionsModel[]{
            new QuestionsModel(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new QuestionsModel(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new QuestionsModel(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    EndGame endgame[] = new EndGame[]{
            new EndGame(R.string.T4_End),
            new EndGame(R.string.T5_End),
            new EndGame(R.string.T6_End)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionView = (TextView) findViewById(R.id.storyTextView);
        mFirstAnswer = (Button) findViewById(R.id.buttonTop);
        mSecondAnswer = (Button) findViewById(R.id.buttonBottom);


        mFirstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "top button pressed");
                if (mstoryIndex == 1) {
                    mQuestionView.setText(question[2].getQuestion());
                    mFirstAnswer.setText(question[2].getAnswerTop());
                    mSecondAnswer.setText(question[2].getAnswerButtom());
                    mstoryIndex = 3;
                } else if (mstoryIndex == 3) {
                    mQuestionView.setText(endgame[2].getEndStory());
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "Please rotate the cell to start from begining", Toast.LENGTH_SHORT).show();
                } else if (mstoryIndex == 2) {
                    mQuestionView.setText(question[2].getQuestion());
                    mFirstAnswer.setText(question[2].getAnswerTop());
                    mSecondAnswer.setText(question[2].getAnswerButtom());
                    mstoryIndex = 3;
                }


            }
        });

        mSecondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "buttom button pressed");
                if (mstoryIndex == 1) {
                    mQuestionView.setText(question[1].getQuestion());
                    mFirstAnswer.setText(question[1].getAnswerTop());
                    mSecondAnswer.setText(question[1].getAnswerButtom());
                    mstoryIndex = 2;
                } else if (mstoryIndex == 2) {
                    mQuestionView.setText(endgame[0].getEndStory());
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "Please rotate the cell to start from begining", Toast.LENGTH_SHORT).show();
                } else if (mstoryIndex == 3) {
                    mQuestionView.setText(endgame[1].getEndStory());
                    mFirstAnswer.setVisibility(View.GONE);
                    mSecondAnswer.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "Please rotate the cell to start from begining", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
