package com.example.jacka.a22_actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        Log.d(TAG, "action bar null ability = " + (myToolbar == null));
        setSupportActionBar(myToolbar);
        /* Set whether to display the activity logo rather than the activity icon. */
        myToolbar.setLogo(R.drawable.ic_settings_applications_black_24dp);
    }


}
