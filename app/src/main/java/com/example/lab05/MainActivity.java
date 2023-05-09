package com.example.lab05;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.edText1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        if (requestCode == 555)
        {
            if (data != null)
            {
                String s = data.getStringExtra("qwe");
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


    public void on_dialog_click(View v)
    {
        String s = txt.getText().toString();

        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("abc", s);

        startActivityForResult(i, 555);
    }

    public void on_exit_click(View v)
    {
        finish();
    }
}