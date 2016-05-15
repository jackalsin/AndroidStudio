package com.example.jacka.a10_seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * This is a class of the seek bar
 * The seek bar is used in the "Brightness Adjustment"
 */
public class MainActivity extends AppCompatActivity {
    private static SeekBar seekBar;

    private static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToSeekBar();

    }

    private void addListenerToSeekBar() {
        textView = (TextView) findViewById(R.id.textView);
        seekBar =(SeekBar) findViewById(R.id.seekBar);

        textView.setText("Covered : " + );

    }

}
