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

        RecyclerView mNumbersList = findViewById(R.id.rv_items);
        mNumbersList.setLayoutManager(new LinearLayoutManager(this));
        String[] list = {"Send an E-mail", "Book a cab", "Collect clothes", "Prepare a presentation", "Attend office party", "Pay bills",};
        mNumbersList.setAdapter(new itemsAdapter(list));
    }
}
