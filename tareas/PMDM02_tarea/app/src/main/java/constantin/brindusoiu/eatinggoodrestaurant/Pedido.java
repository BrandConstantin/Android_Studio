package constantin.brindusoiu.eatinggoodrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pedido extends AppCompatActivity implements View.OnClickListener{
    private String nombre,email,telefono,plato1,plato2,postre,salon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        Button boton=(Button)findViewById(R.id.botonVolverPedido);
        boton.setOnClickListener(this);
        /*
        rellena los campos con los atributos pasados desde la actividad principal y en caso de
        ser nulo muestra un mensaje dentro del campo
         */

        EditText nombreP= (EditText)findViewById(R.id.cuadroNombreP);
        nombre=getIntent().getStringExtra("nombre");
        if(nombre==null){
            nombre="Aún no se ha seleccionado";
        }
        nombreP.setText(nombre);

        EditText emailP=(EditText)findViewById(R.id.cuadroE_mailP);
        email=getIntent().getStringExtra("email");
        if(email==null){
            email="Aún no se ha seleccionado";
        }
        emailP.setText(email);

        EditText telefonoP=(EditText)findViewById(R.id.cuadroTelefonoP);
        telefono=getIntent().getStringExtra("telefono");
        if(telefono==null){
            telefono="Aún no se ha seleccionado";
        }
        telefonoP.setText(telefono);

        EditText plato=(EditText)findViewById(R.id.cuadroPrimeroP);
        plato1=getIntent().getStringExtra("plato1");
        if(plato1==null){
            plato1 ="Aún no se ha seleccionado";
        }
        plato.setText(plato1);

        EditText platoSeg=(EditText)findViewById(R.id.cuadroSegundoP);
        plato2=getIntent().getStringExtra("plato2");
        if(plato2==null){
            plato2="Aún no se ha seleccionado";
        }
        platoSeg.setText(plato2);

        EditText postre1=(EditText)findViewById(R.id.cuadroPostreP);
        postre=getIntent().getStringExtra("postre");
        if(postre==null){
            postre="Aún no se ha seleccionado";
        }
        postre1.setText(postre);

        EditText salon1=(EditText)findViewById(R.id.cuadroSalonP);
        salon=getIntent().getStringExtra("salon");
        if(salon==null){
           salon="Aún no se ha seleccionado";
        }
        salon1.setText(salon);

    }


    public void onClick(View v){
        abrirActividadPrincipal();
    }
    public void abrirActividadPrincipal(){
        /*
        pasa a la actividad principal los parametros
         */
        Intent intentAbrir= new Intent(this, MainActivity.class);
        intentAbrir.putExtra("plato1", plato1);
        intentAbrir.putExtra("plato2", plato2);
        intentAbrir.putExtra("plato3", postre);
        intentAbrir.putExtra("intentNombreUsuario", nombre);
        intentAbrir.putExtra("intentEmailUsuario", email);
        intentAbrir.putExtra("intentTelefonoUsuario", telefono);
        intentAbrir.putExtra("salonSeleccionado", salon);
        startActivity(intentAbrir);
    }
}
