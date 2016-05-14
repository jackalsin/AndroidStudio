package com.example.jacka.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxDog, checkBoxCat, checkBoxCow;
    private Button selectCheckBoxs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnSelectCheckBoxs();
    }

    public void addListenerOnSelectCheckBoxs() {
        checkBoxCat = (CheckBox) findViewById(R.id.checkBoxCat);
        checkBoxCow = (CheckBox) findViewById(R.id.checkBoxCow);
        checkBoxDog = (CheckBox) findViewById(R.id.checkBoxDog);
        selectCheckBoxs = (Button) findViewById(R.id.selectButton);

        selectCheckBoxs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Dog " + checkBoxDog.isChecked() + "\n");
                result.append("Cat " + checkBoxCat.isChecked() + "\n");
                result.append("Cow " + checkBoxCow.isChecked() + "\n");

                /* If user response to a status message is required, consider instead using a Notification.*/
                /* Para: the application Context, the text message, and the duration for the toast */
                Toast.makeText(MainActivity.this, result.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
