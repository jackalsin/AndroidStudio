package com.example.jacka.a16_showtimedialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button showTimePickerDialogButton;

    private int hourX;
    private int minutesX;

    private static final int DIALOG_ID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUPShowTimePickerDialog();
    }

    private void setUPShowTimePickerDialog() {
        showTimePickerDialogButton = (Button) findViewById(R.id.button);
        showTimePickerDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID) {
            /* Todo: see what is this. */
            /*  DatePickerDialog (Context context, DatePickerDialog.OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) */
            return new TimePickerDialog(MainActivity.this, kTimeSetListener, hourX, minutesX, false);
        }

        return null;
    }

    protected TimePickerDialog.OnTimeSetListener kTimeSetListener = new TimePickerDialog.OnTimeSetListener() {

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hourX = hourOfDay;
            minutesX = minute;
            Toast.makeText(MainActivity.this, hourX + ":" + minutesX, Toast.LENGTH_LONG).show();
        }
    };
}
