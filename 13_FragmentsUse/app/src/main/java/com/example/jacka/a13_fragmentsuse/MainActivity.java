package com.example.jacka.a13_fragmentsuse;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.FragmentOne;
import layout.FragmentTwo;

/**
 * Tutorial:
 * 1. Change the Relative to Linear in XML file
 * 2. Create two fragments in the layout folder
 * 3. Add activity_main:
 *      3.1 add fragment element to xml file
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called by the onClick in the activity_main
     * @param v
     */
    public void setChangeFragment(View v) {
        Fragment fragment = null;

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (v == findViewById(R.id.fragmentOneButton)) {
            fragment = new FragmentOne();
        }

        if (v == findViewById(R.id.fragmentTwoButton)) {
            fragment = new FragmentTwo();
        }
        if (fragment == null) return;
        ft.replace(R.id.fragment_place, fragment);
        ft.commit();
    }
}
