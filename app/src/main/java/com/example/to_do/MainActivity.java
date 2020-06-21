package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListData[] myListData = new MyListData[] {
                new MyListData("Email"),
                new MyListData("Info" ),
                new MyListData("Delete"),
                new MyListData("Dialer"),
                new MyListData("Alert"),
                new MyListData("Map"),
                new MyListData("Email"),
                new MyListData("Info"),
                new MyListData("Delete"),
                new MyListData("Dialer"),
                new MyListData("Alert"),
                new MyListData("Map"),
                new MyListData("Map"),
                new MyListData("Map"),
                new MyListData("Map"),
        };
        RecyclerView recyclerView = findViewById(R.id.rv_items);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

