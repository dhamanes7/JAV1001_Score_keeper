package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import  android.widget.*;
import android.view.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreIncrease(View view) {
        TextView team1Score = (TextView) findViewById(R.id.team1Score);
        TextView team2Score = (TextView) findViewById(R.id.team2Score);
        RadioGroup scoreSet = (RadioGroup) findViewById(R.id.scoreGroup);
        Switch teamtoggle = (Switch) findViewById(R.id.teamToggle);
        int currentScore1, currentScore2 = 0;
        if (teamtoggle.isChecked() ){
            currentScore2 = Integer.parseInt(team2Score.getText().toString());
            int id = scoreSet.getCheckedRadioButtonId();
            RadioButton selectedButton = (RadioButton) findViewById(id);
            if (selectedButton.getText().equals("1")) {
                currentScore2 +=1;
                team2Score.setText(Integer.toString(currentScore2));

            } else if (selectedButton.getText().equals("2")){
                currentScore2 +=2;
                team2Score.setText(Integer.toString(currentScore2));

            }else{
                currentScore2 +=3;
                team2Score.setText(Integer.toString(currentScore2));
            }


        }else{
            currentScore1 = Integer.parseInt(team1Score.getText().toString());
            int id = scoreSet.getCheckedRadioButtonId();
            RadioButton selectedButton = (RadioButton) findViewById(id);
            if (selectedButton.getText().equals("1")) {
                currentScore1 +=1;
                team1Score.setText(Integer.toString(currentScore1));

            } else if (selectedButton.getText().equals("2")){
                currentScore1 +=2;
                team1Score.setText(Integer.toString(currentScore1));

            }else{
                currentScore1 +=3;
                team1Score.setText(Integer.toString(currentScore1));
            }


        }


    }

    public void scoreDecrease(View view) {
        TextView team1Score = (TextView) findViewById(R.id.team1Score);
        TextView team2Score = (TextView) findViewById(R.id.team2Score);
        RadioGroup scoreSet = (RadioGroup) findViewById(R.id.scoreGroup);
        Switch teamtoggle = (Switch) findViewById(R.id.teamToggle);
        int currentScore1, currentScore2 = 0;
        if (teamtoggle.isChecked()) {
            currentScore2 = Integer.parseInt(team2Score.getText().toString());
            int id = scoreSet.getCheckedRadioButtonId();
            RadioButton selectedButton = (RadioButton) findViewById(id);
            if (selectedButton.getText().equals("1")) {
                currentScore2 -= 1;
                if (currentScore2<0) {
                    team2Score.setText(Integer.toString(0));
                }else {
                    team2Score.setText(Integer.toString(currentScore2));
                }

            } else if (selectedButton.getText().equals("2")) {
                currentScore2 -= 2;
                if (currentScore2<0) {
                    team2Score.setText(Integer.toString(0));
                }else {
                    team2Score.setText(Integer.toString(currentScore2));
                }

            } else {
                currentScore2 -= 3;
                if (currentScore2<0) {
                    team2Score.setText(Integer.toString(0));
                }else {
                    team2Score.setText(Integer.toString(currentScore2));
                }
            }


        } else {
            currentScore1 = Integer.parseInt(team1Score.getText().toString());
            int id = scoreSet.getCheckedRadioButtonId();
            RadioButton selectedButton = (RadioButton) findViewById(id);
            if (selectedButton.getText().equals("1")) {
                currentScore1 -= 1;
                if (currentScore1<0) {
                    team1Score.setText(Integer.toString(0));
                }else {
                    team1Score.setText(Integer.toString(currentScore1));
                }

            } else if (selectedButton.getText().equals("2")) {
                currentScore1 -= 2;
                if (currentScore1<0) {
                    team1Score.setText(Integer.toString(0));
                }else {
                    team1Score.setText(Integer.toString(currentScore1));
                }


            } else {
                currentScore1 -= 3;
                if (currentScore1<0) {
                    team1Score.setText(Integer.toString(0));
                }else {
                    team1Score.setText(Integer.toString(currentScore1));
                }

            }


        }
    }

    public void reset(View view) {
        TextView team1Score = (TextView) findViewById(R.id.team1Score);
        TextView team2Score = (TextView) findViewById(R.id.team2Score);
        team1Score.setText(Integer.toString(0));
        team2Score.setText(Integer.toString(0));
    }
}