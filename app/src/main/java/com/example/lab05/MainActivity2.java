package com.example.lab05;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1 = findViewById(R.id.edText2);

        Intent i = getIntent();

        String s = i.getStringExtra("abc");
        txt1.setText(s);
    }

    public void on_OK_click(View v)
    {
        Intent i = new Intent();

        String s = txt1.getText().toString();
        i.putExtra("qwe", s);

        setResult(RESULT_OK, i);
        finish();
    }

    public void on_Canc_click(View v)
    {
        setResult(RESULT_CANCELED);
        finish();
    }
}