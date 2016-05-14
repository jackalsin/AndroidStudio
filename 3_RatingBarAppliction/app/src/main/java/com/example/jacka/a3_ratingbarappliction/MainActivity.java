package com.example.jacka.a3_ratingbarappliction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private static RatingBar ratingBar;

    private static Button button;

    private static Logger logger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToRatingBar();
    }

    public void addListenerToRatingBar() {
        button = (Button) findViewById(R.id.submitButton);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int starNum = ratingBar.getNumStars();

                Toast.makeText(MainActivity.this, "You gave us " + starNum + "  start(s)",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
