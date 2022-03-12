package com.example.runninghn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Pais extends AppCompatActivity {
    private ArrayAdapter<String>adapter;
    private ArrayList<String> lista_pais;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);

        //Mandamos a llamar nuestro xml
        String[] country = getResources().getStringArray(R.array.countries);
        lista_pais = new ArrayList<>(Arrays.asList(country));

        ListView lista = (ListView) findViewById(R.id.countryes);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista_pais);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View item, int pos, long id) {
                Toast.makeText(Pais.this, String.format("Pais '%s'", lista_pais.get(pos)), Toast.LENGTH_SHORT).show();


            }
        });
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                lista_pais.remove(pos);
                return;

            }
        });



    }
}