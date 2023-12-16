package com.example.refineandexplorescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.slider.Slider;

public class RefineScreen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private EditText editText;
    private TextView charCountTextView;
    private AppCompatButton coffeeButton, businessBtn, hobbiesBtn, frdShpBtn,
            moviesBtn, dinningBtn, datingBtn, matriBtn, saveBtn;
    private boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refine_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        coffeeButton = findViewById(R.id.coffee);
        businessBtn = findViewById(R.id.business);
        hobbiesBtn = findViewById(R.id.hobbies);
        frdShpBtn = findViewById(R.id.fdship);
        moviesBtn = findViewById(R.id.movies);
        dinningBtn = findViewById(R.id.dinning);
        datingBtn = findViewById(R.id.dating);
        matriBtn = findViewById(R.id.matrimony);
        saveBtn = findViewById(R.id.saveBtn);

        coffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    coffeeButton.setBackgroundResource(R.drawable.checked_bg);
                    coffeeButton.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    coffeeButton.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    coffeeButton.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        businessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    businessBtn.setBackgroundResource(R.drawable.checked_bg);
                    businessBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    businessBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    businessBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        hobbiesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    hobbiesBtn.setBackgroundResource(R.drawable.checked_bg);
                    hobbiesBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    hobbiesBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    hobbiesBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        frdShpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    frdShpBtn.setBackgroundResource(R.drawable.checked_bg);
                    frdShpBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    frdShpBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    frdShpBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        moviesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    moviesBtn.setBackgroundResource(R.drawable.checked_bg);
                    moviesBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    moviesBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    moviesBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        dinningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    dinningBtn.setBackgroundResource(R.drawable.checked_bg);
                    dinningBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    dinningBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    dinningBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        datingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state

                if (isChecked) {
                    datingBtn.setBackgroundResource(R.drawable.checked_bg);
                    datingBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    datingBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    datingBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        matriBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isChecked = !isChecked; // Toggle the checked state
                if (isChecked) {
                    matriBtn.setBackgroundResource(R.drawable.checked_bg);
                    matriBtn.setTextColor(getResources().getColor(android.R.color.white));// Set a checked background
                    // Perform actions when checked
                } else {
                    matriBtn.setBackgroundResource(R.drawable.check_bg); // Set an unchecked background
                    matriBtn.setTextColor(getResources().getColor(android.R.color.black));
                    // Perform actions when unchecked
                }
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RefineScreen.this, ExploreScreen.class);
                startActivity(intent);
            }
        });


        spinner = findViewById(R.id.select_avail);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selecting_availability, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        editText = findViewById(R.id.Status_EditText);
        charCountTextView = findViewById(R.id.charCountTextView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                int currentCount = s.length();
                int maxCount = 250; // Your maximum character limit

                String countText = currentCount + "/" + maxCount;
                charCountTextView.setText(countText);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String text = adapterView.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}