package com.example.myrecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("John wick","john.wick@email.com",R.drawable.b));
        items.add(new item("Robert j","robertj@email.com",R.drawable.c));
        items.add(new item("James Gunn","jame.gunn@email.com",R.drawable.d));
        items.add(new item("Ricky tales","ricky.tales@email.com",R.drawable.e));
        items.add(new item("Mickey mose","micky.mose@email.com",R.drawable.f));
        items.add(new item("John wick","john.wick@email.com",R.drawable.g));
        items.add(new item("John wick","john.wick@email.com",R.drawable.h));
        items.add(new item("John wick","john.wick@email.com",R.drawable.b));
        items.add(new item("John wick","john.wick@email.com",R.drawable.c));
        items.add(new item("John wick","john.wick@email.com",R.drawable.c));
        items.add(new item("John wick","john.wick@email.com",R.drawable.d));
        items.add(new item("John wick","john.wick@email.com",R.drawable.e));
        items.add(new item("John wick","john.wick@email.com",R.drawable.f));
        items.add(new item("John wick","john.wick@email.com",R.drawable.g));
        items.add(new item("John wick","john.wick@email.com",R.drawable.h));
        items.add(new item("John wick","john.wick@email.com",R.drawable.b));
        items.add(new item("John wick","john.wick@email.com",R.drawable.c));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}