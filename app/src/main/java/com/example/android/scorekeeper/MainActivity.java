package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void touchdownTeamA(View view) {
        scoreTeamA+=6;
        displayScoreTeamA(scoreTeamA);
    }
    public void fieldgoalTeamA(View view){
        scoreTeamA+=3;
        displayScoreTeamA(scoreTeamA);
    }
    public void twoPointsConversionTeamA(View view) {
        scoreTeamA+=2;
        displayScoreTeamA(scoreTeamA);
    }

    public void safetyTeamA(View view) {
        scoreTeamA+=2;
        displayScoreTeamA(scoreTeamA);
    }
    public void extraPointTeamA(View view) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void displayScoreTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void touchdownTeamB(View view) {
        scoreTeamB+=6;
        displayScoreTeamB(scoreTeamB);
    }
    public void fieldgoalTeamB(View view){
        scoreTeamB+=3;
        displayScoreTeamB(scoreTeamB);
    }
    public void twoPointsConversionTeamB(View view) {
        scoreTeamB+=2;
        displayScoreTeamB(scoreTeamB);
    }

    public void safetyTeamB(View view) {
        scoreTeamB+=2;
        displayScoreTeamB(scoreTeamB);
    }
    public void extraPointTeamB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void displayScoreTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
