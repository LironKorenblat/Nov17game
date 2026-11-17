package com.example.nov17game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btntop, btndown;
    int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x = 0;
        y = 0;
        btntop = (Button) findViewById(R.id.btntop);
        btndown = (Button) findViewById(R.id.btndown);

        btntop.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                x++;
                return false;
            }
        });

        btndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = y+2;
            }
        });
    }
    public void cheackClick(View view) {
        Intent liron = new Intent(this, secondActivity.class);
        liron.putExtra("x" ,x);
        liron.putExtra("y" ,y);
        startActivity(liron);

    }

    public void topClick(View view) {

    }

    public void downClick(View view) {

    }

}