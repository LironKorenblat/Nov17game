package com.example.nov17game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {
    int x,y;
    TextView redtext, bluetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent liron = getIntent();
        x =  liron.getIntExtra("x" , 0);
        y =  liron.getIntExtra("y" , 0);

        redtext = findViewById(R.id.redtext);
        bluetext = findViewById(R.id.bluetext);

        bluetext.setText(String.valueOf(x));
        redtext.setText(String.valueOf(y));


    }

    public void click(View view) {
        finish();
    }
}