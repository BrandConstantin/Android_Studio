package com.example.usuario.miadaptadorspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.app.Activity;

public class AdaptadorSpinner extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptador_spinner);

        //Array que asociaremos al adaptador
        String[] datos = new String[] {
                "Item1"
                ,"Item2"
                ,"Item3"
        };

        //Creamos el adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, datos);

        //Asociamos el adaptador a la vista.
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adaptador);
    }
}
