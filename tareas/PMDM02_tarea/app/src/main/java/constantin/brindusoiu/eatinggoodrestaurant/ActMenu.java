package constantin.brindusoiu.eatinggoodrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

public class ActMenu extends AppCompatActivity implements View.OnClickListener {
    String plato11, plato22, plato33;
    TabHost tabHost;
    private String nombre,email,telefono,plato1,plato2,postre,salon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button boton = (Button) findViewById(R.id.botonVolverMenu);
        boton.setOnClickListener(this);
        //recuperacion de datos
        nombre=getIntent().getStringExtra("nombre");
        email=getIntent().getStringExtra("email");
        telefono=getIntent().getStringExtra("telefono");
        plato1=getIntent().getStringExtra("plato1");
        plato2=getIntent().getStringExtra("plato2");
        postre=getIntent().getStringExtra("postre");
        salon=getIntent().getStringExtra("salon");


        String[] primeros = new String[]{"Milhojas de patata con sobrasada", "Pastel de carne", "Huevos rellenos",
                "Rollitos de berenjena", "Pasta fresca casera", "Pulpo con puré de patata",
                "Tortilla rota de puerros", "Patatas rellenas de carne", "Huevos rotos", "Salpicón", "No tomaré este plato"};

        String[] segundos = new String[]{"Salmón", "Pescadilla rellena", "Solomillo de cerdo", "Pollo con setas",
                "Lenguado", "Pimientos rellenos", "Bacalao al pil-pil", "Empanadilla de pollo", "Sardinas asadas", "Brochetas de cordero", "No tomaré este plato"};

        String[] postre = new String[]{"Tarta de nuez", "Torta tropical", "Torta rellena", "Tarta de Oreo",
                "Helado", "Café", "Tarta de queso", "Bomba helada", "Brownie de chocolate", "Bueñuelos", "No tomaré este plato"};

        /*
        codigo pestañas
         */
        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Primero");
        spec.setContent(R.id.primeros);
        spec.setIndicator("Primero");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Segundo");
        spec.setContent(R.id.segundos);
        spec.setIndicator("Segundo");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Postre");
        spec.setContent(R.id.postre);
        spec.setIndicator("Postre");
        host.addTab(spec);

        //

        /*
        asignacion de listados
         */
        final ListView milista = (ListView) findViewById(R.id.listaplatos1);
        milista.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        milista.setClickable(true);

        final ListView milista1 = (ListView) findViewById(R.id.listaplatos2);
        milista1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        milista1.setClickable(true);
        final ListView milista2 = (ListView) findViewById(R.id.listaplatos3);
        milista2.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        milista2.setClickable(true);


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, primeros);
        milista.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, segundos);
        milista1.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, postre);
        milista2.setAdapter(adapter2);

        /*
        asigna al atributo el objeto seleccionado de la lista
         */
        milista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {
                plato11 = milista.getItemAtPosition(position).toString();
            }
        });

        milista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                plato22 = milista1.getItemAtPosition(position).toString();
            }
        });

        milista2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                plato33 = milista2.getItemAtPosition(position).toString();
            }
        });


    }

    public void onClick(View v) {
        abrirActividadPrincipal();
    }

    public void abrirActividadPrincipal() {
        Intent intentAbrir = new Intent(this, MainActivity.class);
        /*
        comprueba la seleccion de platos y en caso de no estar completa muestra un mensaje de aviso
        , en caso de estar completa pasa las variables a la pantalla principal y muestra un mensaje.
         */

        if (plato11==null | plato22==null| plato33==null) {
            Toast alerta = Toast.makeText(getApplicationContext(), "No has completado la elección de menú", Toast.LENGTH_LONG);
            alerta.show();
        } else {
            intentAbrir.putExtra("plato1", plato11);
            intentAbrir.putExtra("plato2", plato22);
            intentAbrir.putExtra("plato3", plato33);
            intentAbrir.putExtra("intentNombreUsuario", nombre);
            intentAbrir.putExtra("intentEmailUsuario", email);
            intentAbrir.putExtra("intentTelefonoUsuario", telefono);
            intentAbrir.putExtra("salonSeleccionado", salon);
            Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
            alerta.show();

            startActivity(intentAbrir);
        }


    }
}