package com.apulido.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Main activity class
 *
 * Aqui se realiza el despliegue de una lista de varios nombres donde nos muestra la edad de la persona mostrada
 */
public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public ListView listView;

    public String nombres[] = {"Pepe","Samuel","Valentina","José","Andrea","Karen","Armando"};
    public String edades[] = {"23","33","19","45","32","12","23"};

    @Override
    /**
     * Main activity class
     *
     * Aqui muestra los datos 1
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
        listView = findViewById(R.id.listview1);

        ArrayAdapter <String> array_adapter = new ArrayAdapter<String>(this, R.layout.list_item_listview, nombres);
        listView.setAdapter(array_adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            /**
             * Main activity class
             *
             * Aqui muestra los datos 2
             */
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               textView.setText("Edad de " + listView.getItemAtPosition(position) + " es de " + edades[position] + " años");
            }
        });
    }
}
