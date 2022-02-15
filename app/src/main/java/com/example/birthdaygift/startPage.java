package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class startPage extends AppCompatActivity {

    private Button startButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        startButton= findViewById(R.id.startButton);
        backButton = findViewById(R.id.backButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(startPage.this, QuizPage1.class);
                startActivity(intent);
                Toast.makeText(startPage.this,"Let's go, baby <3", Toast.LENGTH_SHORT).show();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(startPage.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(startPage.this,"Oh no! :<", Toast.LENGTH_SHORT).show();
            }
        });
    }
}