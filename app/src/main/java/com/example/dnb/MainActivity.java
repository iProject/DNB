package com.example.dnb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button signIn;
    Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn = findViewById(R.id.btn_login);
        signIn = findViewById(R.id.btn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //moving to the next page
                Intent nextPage;
                nextPage = new Intent(MainActivity.this, DnbWelcome.class);

                startActivity(nextPage);

            }
        }  );
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // moving to the next page
                Intent nextPage;
                nextPage = new Intent(MainActivity.this, DnbWelcome.class);

                startActivity(nextPage);

            }
        });

    }
}
