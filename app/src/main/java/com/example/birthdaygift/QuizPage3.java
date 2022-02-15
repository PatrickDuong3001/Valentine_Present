package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class QuizPage3 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page3);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        backButton = findViewById(R.id.imageButton4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                falseAnswer();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                falseAnswer();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                falseAnswer();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trueAnswer();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizPage3.this, QuizPage2.class);
                startActivity(intent);
            }
        });
    }

    public void trueAnswer(){
        Dialog myTrueAnswer = new Dialog(QuizPage3.this);
        myTrueAnswer.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myTrueAnswer.setContentView(R.layout.dialog_design5);

        Button nextPage = (Button) myTrueAnswer.findViewById(R.id.nextButton);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizPage3.this, QuizPage4.class);
                startActivity(intent);
            }
        });

        myTrueAnswer.show();
    }

    public void falseAnswer(){
        Dialog myFalseAnswer = new Dialog(QuizPage3.this);
        myFalseAnswer.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myFalseAnswer.setContentView(R.layout.design_dialog6);

        Button back = (Button) myFalseAnswer.findViewById(R.id.backButton);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFalseAnswer.cancel();
            }
        });

        myFalseAnswer.show();
    }
}