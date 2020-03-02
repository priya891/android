package com.example.recyleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            myListData[] myListData = new myListData[]{
                    new myListData("Akaanksha"),
                    new myListData("bharat"),
                    new myListData("priya"),
                    new myListData("astha"),
                    new myListData("priya"),


            };


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myListAdapter adapter = new myListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}