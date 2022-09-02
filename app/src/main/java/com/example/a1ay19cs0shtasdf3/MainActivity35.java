package com.example.a1ay19cs0shtasdf3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main35);


        Button shtbutt = findViewById(R.id.shtbut35);

        shtbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent shtint = new Intent(MainActivity35.this,MainActivity.class);
                startActivity(shtint);
                Toast.makeText(MainActivity35.this, "welcome ", Toast.LENGTH_SHORT).show();
            }
        });


    }
}