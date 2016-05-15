package com.example.jacka.a10_seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This is a class of the seek bar.
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

        textView.setText("Covered : " + seekBar.getProgress() + "/" + seekBar.getMax() );
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            /* These three methods are designed to use different ways to update
                seek bar value changes
            */

            private int progressValue;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue = progress;
                textView.setText("Covered : " + seekBar.getProgress()+ "/" + seekBar.getMax() );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "The seek bar starts processing", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "The seek bar stops processing", Toast.LENGTH_LONG).show();
            }
        });

    }

}
