package com.training.google.jackal.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The method must be public
     * The method must be void return value
     * The getId is the id number reassigned after compile
     * @param view the view that Click
     */
    public void sendMessage(View view) {
        Button sendButon = (Button) findViewById(R.id.sendButton);
        String preMessage = "The view id in parameter = " + String.valueOf(view.getId()) +
                " button find id = " + sendButon.getId() + " and they are " + (String.valueOf(view.getId()).equals(String.
                valueOf(sendButon.getId()))); // it prints true
        Toast.makeText(MainActivity.this, preMessage,Toast.LENGTH_LONG).show();


        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
