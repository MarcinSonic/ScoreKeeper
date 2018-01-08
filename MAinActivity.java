package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int meFedding = 0;
    int meDiaper = 0;
    int meCuddling = 0;
    int wifeFedding = 0;
    int wifeDiaper = 0;
    int wifeCuddling = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the Fedding, changing diaper and cuddling by me.
     */
    public void displayMeFedding(int meFedding) {
        TextView scoreView = findViewById(R.id.me_fedding);
        scoreView.setText(String.valueOf(meFedding));
    }
    public void displayMeDiaper(int meDiaper) {
        TextView scoreView = findViewById(R.id.me_diaper);
        scoreView.setText(String.valueOf(meDiaper));
    }
    public void displayMeCuddling(int meCuddling) {
        TextView scoreView = findViewById(R.id.me_cuddling);
        scoreView.setText(String.valueOf(meCuddling));
    }
    /**
     * Displays the Fedding, changing diaper and cuddling by my wife.
     */
    public void displayWifeFedding(int wifeFedding) {
        TextView scoreView = findViewById(R.id.wife_fedding);
        scoreView.setText(String.valueOf(wifeFedding));
    }
    public void displayWifeDiaper(int wifeDiaper) {
        TextView scoreView = findViewById(R.id.wife_diaper);
        scoreView.setText(String.valueOf(wifeDiaper));
    }
    public void displayWifeCuddling(int wifeCuddling) {
        TextView scoreView = findViewById(R.id.wife_cuddling);
        scoreView.setText(String.valueOf(wifeCuddling));
    }
    /**
     * Increase the score for Me Fedding by 1 point.
     */
    public void addMeFedding(View v) {
        meFedding = meFedding + 1;
        displayMeFedding(meFedding);
    }
    /**
     * Increase the score for Me Changing Diaper by 1 point.
     */
    public void addMeDiaper(View v) {
        meDiaper = meDiaper + 1;
        displayMeDiaper(meDiaper);
    }
    /**
     * Increase the score for Me Cuddling by 1 point.
     */
    public void addMeCuddling(View v) {
        meCuddling = meCuddling + 1;
        displayMeCuddling(meCuddling);
    }
    /**
     * Increase the score for My Wife Fedding by 1 point.
     */
    public void addWifeFedding(View v) {
        wifeFedding = wifeFedding + 1;
        displayWifeFedding(wifeFedding);
    }
    /**
     * Increase the score for My Wife Changing Diaper by 1 point.
     */
    public void addWifeDiaper(View v) {
        wifeDiaper = wifeDiaper + 1;
        displayWifeDiaper(wifeDiaper);
    }
    /**
     * Increase the score for My Wife Cuddling by 1 point.
     */
    public void addWifeCuddling(View v) {
        wifeCuddling = wifeCuddling + 1;
        displayWifeCuddling(wifeCuddling);
    }
    /**
     * reset
     */
    public void reset(View v) {
        meFedding = 0;
        displayMeFedding(meFedding);
        meDiaper = 0;
        displayMeDiaper(meDiaper);
        meCuddling = 0;
        displayMeCuddling(meCuddling);
        wifeFedding = 0;
        displayWifeFedding(wifeFedding);
        wifeDiaper = 0;
        displayWifeDiaper(wifeDiaper);
        wifeCuddling = 0;
        displayWifeCuddling(wifeCuddling);
    }
}
