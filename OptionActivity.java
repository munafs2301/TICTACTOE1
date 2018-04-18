package com.example.android.tic_tac_toe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }
    public  void play_now (View view){
        Intent i = new Intent(this, GamePad.class);
        startActivity(i);}

    public  void score_board (View view){
        Intent i = new Intent(this, ScoreBoard.class);
        startActivity(i);
    }


}
