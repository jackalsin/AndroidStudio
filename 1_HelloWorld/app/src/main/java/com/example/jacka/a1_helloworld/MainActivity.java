package com.example.jacka.a1_helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String MY_TAG = "the_custom_message";
    /* When launching, it calls onCreate, onStart, onResume*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "onPause");
        /* it calls when press the home button
        * If you only switch to multitasking view, it only executes onPause*/
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "onStop");
        /* it calls when press the home button*/
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MY_TAG, "onRestart");
        /* when returning to the */
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "onDestroy");
    }

}
