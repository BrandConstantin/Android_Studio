package com.example.usuario.miproyectolistview;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AdaptadorListView extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptador_list_view);

        //Array que asociaremos al adaptador
        String[] datos = new String[] {
                "Item1"
                ,"Item2"
                ,"Item3"
        };

        //Creamos el adaptador
        ListAdapter adaptador = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, datos);

        //Asociamos el adaptador a la vista.
        ListView lv = (ListView) findViewById(android.R.id.list);
        lv.setAdapter(adaptador);
    }

}
