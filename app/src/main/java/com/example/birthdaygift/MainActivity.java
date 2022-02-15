package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameLog;
    private EditText passLog;
    private ImageButton heartBut;
    private String Username = "Nguyen Thanh Mai";
    private String Password = "08/05/2001";
    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameLog = findViewById(R.id.nameLog);
        passLog = findViewById(R.id.passLog);
        heartBut = findViewById(R.id.heartBut);

        heartBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = nameLog.getText().toString();
                String inputPassword = passLog.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please no empty Name or Password :(", Toast.LENGTH_SHORT).show();
                }
                else
                {
                   isValid = check(inputName,inputPassword);
                   if(!isValid){
                       Toast.makeText(MainActivity.this,"Not my baby >:(", Toast.LENGTH_SHORT).show();
                   }else{
                       Toast.makeText(MainActivity.this,"Yes, that's my girl <3", Toast.LENGTH_SHORT).show();

                       // add code to go to new page
                       Intent intent = new Intent(MainActivity.this, startPage.class);
                       startActivity(intent);
                   }


                }
            }
        });
    }

    private boolean check(String name, String pass){
        if(name.equals(Username) && pass.equals(Password)){
            return true;
        }
        return false;
    }

}