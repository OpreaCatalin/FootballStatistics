package com.example.android.footballstatistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int progressShotsTeamA = 0;
    int progressFoulsTeamA = 0;
    int progressCornersTeamA =0;
    int progressShotsTeamB = 0;
    int progressFoulsTeamB = 0;
    int progressCornersTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForTeamA (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayShotA(progressShotsTeamA + scoreTeamA);
    }

    public  void addShotTeamA (View v) {
        progressShotsTeamA = progressShotsTeamA + 1;
        displayShotA(progressShotsTeamA + scoreTeamA);
    }

    public  void addFoultTeamA (View v) {
        progressFoulsTeamA = progressFoulsTeamA + 1;
        displayFoultA(progressFoulsTeamA);
    }

    public  void addCornerTeamA (View v) {
        progressCornersTeamA = progressCornersTeamA+ 1;
        displayCornerA(progressCornersTeamA);
    }

    public void addGoalForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayShotB(progressShotsTeamB + scoreTeamB);
    }

    public  void addShotTeamB (View v) {
        progressShotsTeamB = progressShotsTeamB + 1;
        displayShotB(progressShotsTeamB + scoreTeamB);
    }

    public  void addFoultTeamB (View v) {
        progressFoulsTeamB = progressFoulsTeamB + 1;
        displayFoultB(progressFoulsTeamB);
    }

    public  void addCornerTeamB (View v) {
        progressCornersTeamB = progressCornersTeamB+ 1;
        displayCornerB(progressCornersTeamB);
    }

    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        progressCornersTeamA = 0;
        progressCornersTeamB = 0;
        progressFoulsTeamA = 0;
        progressFoulsTeamB = 0;
        progressShotsTeamA = 0;
        progressShotsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayCornerA(progressCornersTeamA);
        displayCornerB(progressCornersTeamB);
        displayFoultA(progressFoulsTeamA);
        displayFoultB(progressFoulsTeamB);
        displayShotA(progressShotsTeamA);
        displayShotB(progressShotsTeamB);

    }

    /**
     * Displays the given one corner for B.
     */
    public  void  displayCornerB (int corner) {
        ProgressBar progressCornerB =(ProgressBar)findViewById(R.id.progress_bar_corner_b);
        progressCornerB.setProgress(Integer.parseInt(String.valueOf(corner)));
    }

    /**
     * Displays the given one foult for B.
     */
    public  void  displayFoultB (int foult) {
        ProgressBar progressFoultB =(ProgressBar)findViewById(R.id.progress_bar_fouls_b);
        progressFoultB.setProgress(Integer.parseInt(String.valueOf(foult)));
    }

    /**
     * Displays the given one shot for B.
     */
    public  void  displayShotB (int shot) {
        ProgressBar progressShotB =(ProgressBar)findViewById(R.id.progress_bar_shots_b);
        progressShotB.setProgress(Integer.parseInt(String.valueOf(shot)));
    }

    /**
     * Displays the given one corner for A.
     */
    public  void  displayCornerA (int corner) {
        ProgressBar progressCornerA =(ProgressBar)findViewById(R.id.progress_bar_corner_a);
        progressCornerA.setProgress(Integer.parseInt(String.valueOf(corner)));
    }

    /**
     * Displays the given one foult for A.
     */
    public  void  displayFoultA (int foult) {
        ProgressBar progressFoultA =(ProgressBar)findViewById(R.id.progress_bar_fouls_a);
        progressFoultA.setProgress(Integer.parseInt(String.valueOf(foult)));
    }

    /**
     * Displays the given one shot for A.
     */
    public  void  displayShotA (int shot) {
        ProgressBar progressShotA =(ProgressBar)findViewById(R.id.progress_bar_shots_a);
        progressShotA.setProgress(Integer.parseInt(String.valueOf(shot)));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
