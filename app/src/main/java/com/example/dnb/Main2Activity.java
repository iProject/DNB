package com.example.dnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dnb_sign_up_screen);

        signUp = findViewById(R.id.sign_up);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // going to the next screen

                Intent nextScreen;
                nextScreen = new Intent(Main2Activity.this, Main3Activity.class);

                startActivity(nextScreen);
            }
        });
    }
}