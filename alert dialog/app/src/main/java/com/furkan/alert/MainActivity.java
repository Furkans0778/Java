package com.furkan.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       alert = new AlertDialog.Builder(this);
        Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();
    }
    public void enter(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Hello :)");
        alert.setMessage("How Are You :)");
        alert.setPositiveButton("Good ty", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Always Be Happy",Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton(":(", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"I hope u will happy",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}