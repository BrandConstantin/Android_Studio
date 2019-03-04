package constantin.brindusoiu.eatinggoodrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Salon extends AppCompatActivity implements View.OnClickListener{
    private String salonSeleccionado;
    private String nombre,email,telefono,plato1,plato2,postre,salon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);
        Button boton=(Button)findViewById(R.id.botonVolverSalon);
        boton.setOnClickListener(this);

        nombre=getIntent().getStringExtra("nombre");
        email=getIntent().getStringExtra("email");
        telefono=getIntent().getStringExtra("telefono");
        plato1=getIntent().getStringExtra("plato1");
        plato2=getIntent().getStringExtra("plato2");
        postre=getIntent().getStringExtra("postre");
        salon=getIntent().getStringExtra("salon");
    }

    public void onClick(View v){
        abrirActividadPrincipal();
    }
    public void abrirActividadPrincipal(){
        Intent intentAbrir= new Intent(this, MainActivity.class);
        CheckBox seleccion=findViewById(R.id.checkBoxDali);
        CheckBox seleccion1=findViewById(R.id.checkBoxGoya);
        CheckBox seleccion2= findViewById(R.id.checkBoxMurillo);
        CheckBox seleccion3=findViewById(R.id.checkBoxPicasso);
        CheckBox seleccion4=findViewById(R.id.checkBoxSorolla);
        CheckBox seleccion5=findViewById(R.id.checkBoxVelazquez);
    //creacion de un array con todos los checkbox
        CheckBox[] grupo=new CheckBox[6];

        grupo[0]=seleccion;
        grupo[1]=seleccion1;
        grupo[2]=seleccion2;
        grupo[3]=seleccion3;
        grupo[4]=seleccion4;
        grupo[5]=seleccion5;
    //variable que indicara el numero de checkbox seleccionados
        int numeroDeSeleccionados=0;

    //bucle para comprobar cuantos checkbox estan seleccionados
        for(int i=0;i<grupo.length;i++){
            if(grupo[i].isChecked()) {
                numeroDeSeleccionados++;
            }
        }
        if(numeroDeSeleccionados>1){
            Toast alerta=Toast.makeText(getApplicationContext(),"No puede elegir más de un salón",Toast.LENGTH_LONG);
            alerta.show();
    //en caso de  estar selecionado pasa el texto a la actividad pedido y muestra un mensaje de confirmacion
        }
        else{

            //checkbox elegido
            if (seleccion.isChecked()) {
                salonSeleccionado = seleccion.getText().toString();
                intentAbrir.putExtra("intentNombreUsuario", nombre);
                intentAbrir.putExtra("intentEmailUsuario", email);
                intentAbrir.putExtra("intentTelefonoUsuario", telefono);
                intentAbrir.putExtra("salonSeleccionado", salonSeleccionado);
                intentAbrir.putExtra("plato1", plato1);
                intentAbrir.putExtra("plato2", plato2);
                intentAbrir.putExtra("plato3", postre);
                Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
                alerta.show();
                startActivity(intentAbrir);
            } else if (seleccion1.isChecked()) {
                salonSeleccionado = seleccion1.getText().toString();
                intentAbrir.putExtra("intentNombreUsuario", nombre);
                intentAbrir.putExtra("intentEmailUsuario", email);
                intentAbrir.putExtra("intentTelefonoUsuario", telefono);
                intentAbrir.putExtra("salonSeleccionado", salonSeleccionado);
                intentAbrir.putExtra("plato1", plato1);
                intentAbrir.putExtra("plato2", plato2);
                intentAbrir.putExtra("plato3", postre);
                Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
                alerta.show();
                startActivity(intentAbrir);
            } else if (seleccion2.isChecked()) {
                salonSeleccionado = seleccion1.getText().toString();
                intentAbrir.putExtra("intentNombreUsuario", nombre);
                intentAbrir.putExtra("intentEmailUsuario", email);
                intentAbrir.putExtra("intentTelefonoUsuario", telefono);
                intentAbrir.putExtra("salonSeleccionado", salonSeleccionado);
                intentAbrir.putExtra("plato1", plato1);
                intentAbrir.putExtra("plato2", plato2);
                intentAbrir.putExtra("plato3", postre);
                Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
                alerta.show();
                startActivity(intentAbrir);
            } else if (seleccion3.isChecked()) {
                salonSeleccionado = seleccion1.getText().toString();
                intentAbrir.putExtra("intentNombreUsuario", nombre);
                intentAbrir.putExtra("intentEmailUsuario", email);
                intentAbrir.putExtra("intentTelefonoUsuario", telefono);
                intentAbrir.putExtra("salonSeleccionado", salonSeleccionado);
                intentAbrir.putExtra("plato1", plato1);
                intentAbrir.putExtra("plato2", plato2);
                intentAbrir.putExtra("plato3", postre);
                Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
                alerta.show();
                startActivity(intentAbrir);
            } else if (seleccion4.isChecked()) {
                salonSeleccionado = seleccion1.getText().toString();
                intentAbrir.putExtra("intentNombreUsuario", nombre);
                intentAbrir.putExtra("intentEmailUsuario", email);
                intentAbrir.putExtra("intentTelefonoUsuario", telefono);
                intentAbrir.putExtra("salonSeleccionado", salonSeleccionado);
                intentAbrir.putExtra("plato1", plato1);
                intentAbrir.putExtra("plato2", plato2);
                intentAbrir.putExtra("plato3", postre);
                Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
                alerta.show();
                startActivity(intentAbrir);
            } else if (seleccion5.isChecked()) {
                salonSeleccionado = seleccion1.getText().toString();
                intentAbrir.putExtra("intentNombreUsuario", nombre);
                intentAbrir.putExtra("intentEmailUsuario", email);
                intentAbrir.putExtra("intentTelefonoUsuario", telefono);
                intentAbrir.putExtra("salonSeleccionado", salonSeleccionado);
                intentAbrir.putExtra("plato1", plato1);
                intentAbrir.putExtra("plato2", plato2);
                intentAbrir.putExtra("plato3", postre);
                Toast alerta = Toast.makeText(getApplicationContext(), "Su pedido ha sido actualizado", Toast.LENGTH_LONG);
                alerta.show();
                startActivity(intentAbrir);
            } else {
                Toast alerta = Toast.makeText(getApplicationContext(), "No has elegido ningún salón", Toast.LENGTH_LONG);
                alerta.show();
            }
        }

    }
}
