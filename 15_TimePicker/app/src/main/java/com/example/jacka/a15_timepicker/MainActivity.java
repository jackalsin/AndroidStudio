package com.example.jacka.a15_timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static TimePicker timePicker;
    private static Button showTimeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpTimePick();

    }

    private void setUpTimePick() {
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        showTimeButton = (Button) findViewById(R.id.showTimeButton);

        showTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                String timeStr = String.format("%d: %d", hour,minute);
                Toast.makeText(getBaseContext(), timeStr, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
