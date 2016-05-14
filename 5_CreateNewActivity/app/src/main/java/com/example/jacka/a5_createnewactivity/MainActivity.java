package com.example.jacka.a5_createnewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button createNewActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToCreateNewActivityButton();
    }

    private void addListenerToCreateNewActivityButton() {
        createNewActivityButton = (Button) findViewById(R.id.createNewActivityButton);
        createNewActivityButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                /* Intent is the new Activity ?*/
                Intent intent = new Intent("com.example.jacka.a5_createnewactivity.secActivity.SecondActivity");
                startActivity(intent);
            }
        });



    }
}
