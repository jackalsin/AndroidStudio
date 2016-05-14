package com.example.jacka.a6_analogclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {


    private static AnalogClock analogClock;
    private static TextClock textClock;
    private static Button swapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToSwapButton();

    }

    private void addListenerToSwapButton() {
        analogClock = (AnalogClock) findViewById(R.id.analogClock);
        textClock = (TextClock) findViewById(R.id.textClock);
        swapButton =(Button) findViewById(R.id.swapButton);
        analogClock.setVisibility(analogClock.GONE);

        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (analogClock.getVisibility() == analogClock.GONE) {
                    analogClock.setVisibility(analogClock.VISIBLE);
                    textClock.setVisibility(textClock.GONE);
                } else if (textClock.getVisibility() == textClock.GONE) {
                    analogClock.setVisibility(analogClock.GONE);
                    textClock.setVisibility(textClock.VISIBLE);
                }
            }
        });


    }
}
