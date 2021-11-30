package com.example.e_learning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class verifyotp extends AppCompatActivity {
    public CardView continuebutton;
    public EditText phone_input;
    String number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifyotp);
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verifyotp.this, otpscreen.class);
                number = phone_input.getText().toString();
                intent.putExtra("number", number);
                startActivity(intent);
            }
        });
    }

}