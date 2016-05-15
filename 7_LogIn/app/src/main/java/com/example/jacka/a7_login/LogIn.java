package com.example.jacka.a7_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button loginButton;
    private static final int ATTEMPTS_LIMITS = 5;
    private static int attempDownCount = ATTEMPTS_LIMITS;
    private static final String VALID_USERNAME = "username";
    private static final String VALID_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        addListenerToLoginButton();
    }

    private void addListenerToLoginButton() {
        username = (EditText) findViewById(R.id.editTextUsername);
        password = (EditText) findViewById(R.id.editTextPassword);
        attempts = (TextView) findViewById(R.id.textViewAttempNumbers);
        loginButton = (Button) findViewById(R.id.loginButton);

        attempts.setText(Integer.toString(attempDownCount));

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(VALID_USERNAME) &&
                        password.getText().toString().equals(VALID_PASSWORD)) {

                    Intent intent = new Intent("com.example.jacka.a7_login.user.UserActivity");
                    startActivity(intent);

                } else {
                    Toast.makeText(LogIn.this, "Invalid username or password ", Toast.LENGTH_LONG).show();
                    attempDownCount--;
                    attempts.setText(Integer.toString(attempDownCount));
                    if (attempDownCount == 0) {
                        /* if user attempts more than limit time, disable the login button*/
                        loginButton.setEnabled(false);
                    }
                }
            }
        });

    }
}
