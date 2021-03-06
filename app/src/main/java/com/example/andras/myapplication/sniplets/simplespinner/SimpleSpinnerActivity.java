package com.example.andras.myapplication.sniplets.simplespinner;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.andras.myapplication.R;

public class SimpleSpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_spinner);
        SimpleSpinner simpleSpinner = findViewById(R.id.spinner);
        simpleSpinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, android.R.id.text1, new String[]{"First","Second", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third"}), 2);
        simpleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Selected item - " + position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner spinner = findViewById(R.id.spinner2);
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, android.R.id.text1, new String[]{"First","Second", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third", "Third"}));
    }
}
