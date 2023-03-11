package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.*;

public class
ListActivity2 extends AppCompatActivity {
    ListView listView;
    TextView textView;

    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        listView=(ListView) findViewById(R.id.listView);
        listItem=getResources().getStringArray(R.array.characters);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.my_list, R.id.textView, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "value", Toast.LENGTH_SHORT).show();
            }
        });
    }
}