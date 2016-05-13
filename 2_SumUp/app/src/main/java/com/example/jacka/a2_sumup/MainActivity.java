package com.example.jacka.a2_sumup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText e1 = (EditText) findViewById(R.id.addNumber1);
        EditText e2 = (EditText) findViewById(R.id.addNumber2);
        TextView title = (TextView) findViewById(R.id.textView);

        int addNumber1 = Integer.parseInt(e1.getText().toString());
        int addNumber2 = Integer.parseInt(e2.getText().toString());

        int sum = addNumber1 + addNumber2;

        title.setText(Integer.toString(sum));

    }


}
