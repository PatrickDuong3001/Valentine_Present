package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GiftContent extends AppCompatActivity {
    private MediaPlayer mMedia;
    private ImageButton toLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_content);
        mMedia = MediaPlayer.create(this, R.raw.lovesong);
        mMedia.start();

        toLogin = findViewById(R.id.imageButton2);

        mMedia.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(GiftContent.this, "I love you!", Toast.LENGTH_LONG).show();
                releasedMedia();
            }
        });

        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiftContent.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void releasedMedia()
    {
        if (mMedia != null){
            mMedia.release();
            mMedia = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasedMedia();
    }
}