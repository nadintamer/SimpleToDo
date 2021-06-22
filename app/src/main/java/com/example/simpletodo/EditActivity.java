package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText editTextUpdate;
    Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editTextUpdate = findViewById(R.id.editTextUpdate);
        buttonSave = findViewById(R.id.buttonSave);

        getSupportActionBar().setTitle("Edit item");

        String itemBeingEdited = getIntent().getStringExtra(MainActivity.KEY_ITEM_TEXT);
        editTextUpdate.setText(itemBeingEdited);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra(MainActivity.KEY_ITEM_TEXT, editTextUpdate.getText().toString());
                int position = getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION);
                i.putExtra(MainActivity.KEY_ITEM_POSITION, position);
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}