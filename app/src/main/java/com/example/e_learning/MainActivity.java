package com.example.e_learning;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardView Ebooksbtn,Videolecbtn,Certificationbtn,Livesessionbtm,Suportbtn,Chatbotbtn;

    int counter = 0;
    @Override
    public void onBackPressed() {
        counter++;
        if (counter == 2)
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Ebooksbtn=findViewById(R.id.ebookbtn);
        Ebooksbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),eboks.class);
                startActivity(i);
                setContentView(R.layout.activity_eboks);
            }
        });
        Videolecbtn=findViewById(R.id.videolecbtn);
        Videolecbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),eboks.class);
                startActivity(i);
                setContentView(R.layout.activity_videolecture);
            }
        });
        Certificationbtn=findViewById(R.id.certificationbtn);
        Certificationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),eboks.class);
                startActivity(i);
                setContentView(R.layout.activity_certification);
            }
        });
        Livesessionbtm=findViewById(R.id.lvesessionbtm);
        Livesessionbtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),eboks.class);
                startActivity(i);
                setContentView(R.layout.activity_livesession);
            }
        });
        Suportbtn=findViewById(R.id.suportbtn);
        Suportbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),eboks.class);
                startActivity(i);
                setContentView(R.layout.activity_support);
            }
        });
        Chatbotbtn=findViewById(R.id.chatbotbtn);
        Chatbotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),eboks.class);
                startActivity(i);
                setContentView(R.layout.activity_chatbot);
            }
        });


        }




    }

