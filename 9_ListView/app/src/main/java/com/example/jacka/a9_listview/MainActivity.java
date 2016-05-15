package com.example.jacka.a9_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static ListView listView;
    private static final String[] NAMES = new String[] {"Alpha", "Beta", "Charlie", "Delta", "Echo", "Florida"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToListView();
    }

    private void addListenerToListView() {
        listView = (ListView) findViewById(R.id.listView);
        /* let all the names into the array adapter*/
        ArrayAdapter<String> nameArrayAdapter = new ArrayAdapter<String>(this,R.layout.name_list,NAMES);
        listView.setAdapter(nameArrayAdapter);
        listView.setOnItemClickListener(new ListView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) listView.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, "Position " + position + " value :" + value,
                        Toast.LENGTH_LONG).show();
            }
        });

    }

}
