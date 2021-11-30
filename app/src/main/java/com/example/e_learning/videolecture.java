package com.example.e_learning;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class videolecture extends AppCompatActivity {

    RecyclerView Mrecycleview;
    FirebaseDatabase database;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolecture);
        Mrecycleview = findViewById(R.id.recycleview_video);
        Mrecycleview.setHasFixedSize(true);
        Mrecycleview.setLayoutManager(new LinearLayoutManager(this));
        reference = database.getReference("video");
        database = FirebaseDatabase.getInstance();

    }
    };


