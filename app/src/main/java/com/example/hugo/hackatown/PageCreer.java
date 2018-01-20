package com.example.hugo.hackatown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageCreer extends AppCompatActivity {
    Button  buttonCreerEvenement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_creer);
        Button  buttonCreerEvenement;
        buttonCreerEvenement = (Button) findViewById(R.id.buttonCreerEvenement);

        buttonCreerEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(PageCreer.this,creationActivite.class);
                startActivity(toy);
            }
        });
    }


}
