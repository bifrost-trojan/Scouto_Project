package com.example.scoutoproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView proList = findViewById(R.id.recyclerView);
        proList.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> dta = new ArrayList<String>();
        dta.add("POO40");
        dta.add("POO41");
        dta.add("POO42");
        proList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        proList.setAdapter(new HomeAdapter(dta));
    }
}