package com.bignerdranch.android.brainwaves;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bignerdranch.android.brainwaves.ReferenceClasses.MathGame1Activity;

public class EndOfGameActivity extends AppCompatActivity {
    private Button backButton;
    private Button playAgain;
    private TextView mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_game);
        mScore = (TextView) findViewById(R.id.score_of_game);
        mScore.setText(R.string.score);

        backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndOfGameActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });
        playAgain = (Button) findViewById(R.id.play_again_button);
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndOfGameActivity.this, MathGame1Activity.class);
                startActivity(intent);
            }
        });

    }

}
