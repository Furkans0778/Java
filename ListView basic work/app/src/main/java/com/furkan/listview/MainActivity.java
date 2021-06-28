package com.furkan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listUI;
    ArrayAdapter listeAdapter;
    static String _deneme;  //static!
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listUI = findViewById(R.id.listeUI);

        ArrayList<String> liste = new ArrayList();

        liste.add("bir");
        liste.add("iki");
        liste.add("uc");
        liste.add("dort");

        listeAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, liste);
        listUI.setAdapter(listeAdapter);

        listUI.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int index, long id) {
                Intent sayfaGec = new Intent(MainActivity.this, in.class);
                // sayfaGec.putExtra("data", liste.get(index)); // ##opinional
                _deneme = liste.get(index);
                startActivity(sayfaGec);

            }
        });

    }
}