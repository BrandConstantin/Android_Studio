package constantin.brindusoiu.eatinggoodrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static constantin.brindusoiu.eatinggoodrestaurant.R.id.botonMenu;
import static constantin.brindusoiu.eatinggoodrestaurant.R.id.botonPedido;
import static constantin.brindusoiu.eatinggoodrestaurant.R.id.botonSalon;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //parametros a pasar a la actividad a pedido
    private String nombre, email, telefono, salon, plato1, plato2, postre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.barraSuperior);
        setSupportActionBar(myToolbar);
        Button boton =(Button)findViewById(R.id.botonRegistro);
        boton.setOnClickListener(this);
        Button boton1 =(Button)findViewById(botonSalon);
        boton1.setOnClickListener(this);
        Button boton2 =(Button)findViewById(botonMenu);
        boton2.setOnClickListener(this);
        Button boton3 =(Button)findViewById(botonPedido);
        boton3.setOnClickListener(this);
        //recibe parametros
        //variables

        nombre = getIntent().getStringExtra("intentNombreUsuario");
        email = getIntent().getStringExtra("intentEmailUsuario");
        telefono = getIntent().getStringExtra("intentTelefonoUsuario");
        plato1 = getIntent().getStringExtra("plato1");
        plato2 = getIntent().getStringExtra("plato2");
        postre = getIntent().getStringExtra("plato3");
        salon = getIntent().getStringExtra("salonSeleccionado");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // metodo para seleccionar la actividad a abrir
    public void onClick(View v){
        switch (v.getId()){
            case R.id.botonRegistro:
                abrirRegistro();

                break;
            case R.id.botonSalon:
                abrirSalon();

                break;
            case R.id.botonMenu:
                abrirMenu();
                break;
            case R.id.botonPedido:
                abrirPedido();
                break;

            default:break;
        }
    }

    // cada metodo abre la actividad correspondiente pasando los parametros a asignar y asignados
    public void abrirRegistro(){

        Intent intentAbrir = new Intent(this,Registro.class);
        intentAbrir.putExtra("nombre",nombre);
        intentAbrir.putExtra("email",email);
        intentAbrir.putExtra("telefono",telefono);
        intentAbrir.putExtra("plato1",plato1);
        intentAbrir.putExtra("plato2",plato2);
        intentAbrir.putExtra("plato3",postre);
        intentAbrir.putExtra("salon",salon);
        startActivity(intentAbrir);
    }

    public void abrirSalon(){
        Intent intentAbrir = new Intent(this,Salon.class);
        intentAbrir.putExtra("nombre",nombre);
        intentAbrir.putExtra("email",email);
        intentAbrir.putExtra("telefono",telefono);
        intentAbrir.putExtra("plato1",plato1);
        intentAbrir.putExtra("plato2",plato2);
        intentAbrir.putExtra("plato3",postre);
        intentAbrir.putExtra("salon",salon);
        startActivity(intentAbrir);
    }

    public void abrirMenu(){
        Intent intentAbrir = new Intent(this,Menus.class);
        intentAbrir.putExtra("nombre",nombre);
        intentAbrir.putExtra("email",email);
        intentAbrir.putExtra("telefono",telefono);
        intentAbrir.putExtra("plato1",plato1);
        intentAbrir.putExtra("plato2",plato2);
        intentAbrir.putExtra("plato3",postre);
        intentAbrir.putExtra("salon",salon);
        startActivity(intentAbrir);
    }
    public void abrirPedido(){
        Intent intentAbrir= new Intent(this,Pedido.class);

        intentAbrir.putExtra("nombre",nombre);
        intentAbrir.putExtra("email",email);
        intentAbrir.putExtra("telefono",telefono);
        intentAbrir.putExtra("plato1",plato1);
        intentAbrir.putExtra("plato2",plato2);
        intentAbrir.putExtra("postre",postre);
        intentAbrir.putExtra("salon",salon);
        startActivity(intentAbrir);
    }
    public void abrirAyuda(){
        Intent intentAbrir= new Intent(this, Ayuda.class);
        startActivity(intentAbrir);
    }
    public void abrirAcercaDe(){
        Intent intentAbrir= new Intent(this, AcercaDe.class);
        startActivity(intentAbrir);
    }
    //metodo para abrir opciones menu
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.opcion1:
                abrirAyuda();
                return true;
            case R.id.opcion2:
                abrirAcercaDe();
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
}
