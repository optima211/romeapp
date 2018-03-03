package com.example.nedmk.rome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton addbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbutton = (ImageButton)findViewById(R.id.addbutton);
        addbutton.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome.AddActivity");
                        startActivity(intent);
                    }

                }
        );
    }
    private void addListenerOnButton (){

    }
}
