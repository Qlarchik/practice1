package com.mirea.shakhnazaryan.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.textView4);
        myTextView.setText("Name");

        Button myButton = findViewById(R.id.button15);
        myButton.setText("Save");

        CheckBox myCheckBox = findViewById(R.id.checkBox2);
        myCheckBox.setText("CheckBox test");
        myCheckBox.setChecked(true);
    }
}