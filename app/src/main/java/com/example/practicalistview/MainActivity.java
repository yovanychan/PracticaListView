package com.example.practicalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    // se crean los vectores
    private String nombres [] = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria",
            "Benjamin","Gerardo", "Carlos", "David", "Sofia"}; // se encarga de mostrar los elementos cuando arranca la aplicacion
    private String edades [] = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"}; // se encarga de mostrar los elementos que va contener el listview al seleccionar cada nombre


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_listview, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(position) + " es " + edades[position] + " años");
            }
        });
    }
}