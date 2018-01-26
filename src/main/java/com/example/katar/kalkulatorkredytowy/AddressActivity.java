package com.example.katar.kalkulatorkredytowy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by katar on 26.01.2018.
 */

public class AddressActivity  extends AppCompatActivity {

    Button powrot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        powrot = findViewById(R.id.btCofnij);
        powrot.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), GeneralActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
