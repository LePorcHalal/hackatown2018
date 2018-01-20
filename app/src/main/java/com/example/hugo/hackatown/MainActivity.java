package com.example.hugo.hackatown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonA;
    Button buttonB;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = (Button) findViewById(R.id.button);
        buttonB = (Button) findViewById(R.id.button2);
        txt = (TextView) findViewById(R.id.txt);
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button){
            txt.setText("I DID IT MOM button 1");
        }
        if(view.getId()==R.id.button2){
            txt.setText("I DID IT MOM button 2");
        }
    }
}
