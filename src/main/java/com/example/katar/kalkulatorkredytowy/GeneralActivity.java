package com.example.katar.kalkulatorkredytowy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by katar on 26.01.2018.
 */

public class GeneralActivity  extends AppCompatActivity {

    Button btDalej;
    Button btGdzie;
    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        btDalej = findViewById(R.id.btDalej);
        btGdzie = findViewById(R.id.btGdzie);
       

        btDalej.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        btGdzie.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AddressActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });




    }
}
