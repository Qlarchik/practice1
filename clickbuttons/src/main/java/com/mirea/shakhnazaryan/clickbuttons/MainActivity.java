package com.mirea.shakhnazaryan.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnOK;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };

        btnOK.setOnClickListener(oclBtnOK);
    }

    public void onMyButtonClick(View view) {
        Toast.makeText(this, "Еще один способ", Toast.LENGTH_SHORT).show();
    }
}