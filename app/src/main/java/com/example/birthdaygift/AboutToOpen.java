package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AboutToOpen extends AppCompatActivity {
    private ImageButton openButton;
    private ImageButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_to_open);

        openButton = findViewById(R.id.imageButton);
        backButton = findViewById(R.id.imageButton4);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutToOpen.this, GiftContent.class);
                startActivity(intent);;
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutToOpen.this, FinalQuizPage.class);
                startActivity(intent);
            }
        });
    }
}