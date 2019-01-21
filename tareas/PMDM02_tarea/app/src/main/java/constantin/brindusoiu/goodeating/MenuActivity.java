package constantin.brindusoiu.goodeating;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Array que asociaremos al adaptador
        /*String[] plato1 = new String[] {
                "Plato 1",
                "Plato 2",
                "Plato 3",
                "Plato 4",
                "Plato 5",
                "Plato 6",
                "Plato 7",
                "Plato 8",
                "Plato 9",
                "Plato 10"
        };

        //Creamos el adaptador
        ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, plato1);

        //Asociamos el adaptador a la vista.
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adaptador1);*/

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.plato1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Array que asociaremos al adaptador
        String[] plato2 = new String[] {
                "Segundo Plato 1",
                "Segundo Plato 2",
                "Segundo Plato 3",
                "Segundo Plato 4",
                "Segundo Plato 5",
                "Segundo Plato 6",
                "Segundo Plato 7",
                "Segundo Plato 8",
                "Segundo Plato 9",
                "Segundo Plato 10"
        };

        //Creamos el adaptador
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, plato2);

        //Asociamos el adaptador a la vista.
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(adaptador2);

        //Array que asociaremos al adaptador
        String[] postre = new String[] {
                "Postre 1",
                "Postre 2",
                "Postre 3",
                "Postre 4",
                "Postre 5",
                "Postre 6",
                "Postre 7",
                "Postre 8",
                "Postre 9",
                "Postre 10"
        };

        //Creamos el adaptador
        ArrayAdapter<String> adaptador3 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, postre);

        //Asociamos el adaptador a la vista.
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setAdapter(adaptador3);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
