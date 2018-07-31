package com.example.a17010233.practicalquiz11;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAcc;
    Button btnAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAcc = findViewById(R.id.editTextAcc);
        btnAcc = findViewById(R.id.buttonAcc);

        btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String accName = etAcc.getText().toString();

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Account's Submission");
                myBuilder.setMessage("Submit: " +  accName);
                myBuilder.setCancelable(false);

                myBuilder.setPositiveButton("confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, accName + " submitted", Toast.LENGTH_SHORT).show();
                    }
                });

                myBuilder.setNegativeButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
