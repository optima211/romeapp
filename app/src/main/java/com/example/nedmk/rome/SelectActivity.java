package com.example.nedmk.rome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectActivity extends AppCompatActivity {
    private ImageButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        homeButton = (ImageButton)findViewById(R.id.homeButton);
        homeButton.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome.MainActivity");
                        startActivity(intent);
                    }

                }
        );
    }
}
