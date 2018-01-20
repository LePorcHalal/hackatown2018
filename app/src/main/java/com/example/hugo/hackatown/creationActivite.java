package com.example.hugo.hackatown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class creationActivite extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String [] typeSports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_activite);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.choixSport);
        typeSports = getResources().getStringArray(R.array.type_sport);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,typeSports);
        autoCompleteTextView.setAdapter(adapter);

    }
}
