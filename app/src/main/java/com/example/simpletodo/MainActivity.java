package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;
    Button buttonAdd;
    EditText editTextItem;
    RecyclerView recyclerViewItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        editTextItem = findViewById(R.id.editTextItem);
        recyclerViewItems = findViewById(R.id.recyclerViewItems);

        items = new ArrayList<>();
        items.add("Buy milk");
        items.add("Go to the gym");
        items.add("Feed the cat");

        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        recyclerViewItems.setAdapter(itemsAdapter);
        recyclerViewItems.setLayoutManager(new LinearLayoutManager(this));
    }
}