package constantin.brindusoiu.eatinggoodrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity implements View.OnClickListener {
    private String nombre,email,telefono,plato1,plato2,postre,salon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button boton=(Button)findViewById(R.id.botonVolverRegistro);
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
        //parametros a pasar a la actividad pedido
        EditText nombreU=(EditText)findViewById(R.id.campoNombre);
        EditText emailU=(EditText)findViewById(R.id.campoEmail);
        EditText telefonoU=(EditText)findViewById(R.id.campoTelefono);
        String nombreUsuario=nombreU.getText().toString();
        String emailusuario=emailU.getText().toString();
        String telefonoUsuario=telefonoU.getText().toString();
        //en caso de estar vacios
        if(nombreUsuario.isEmpty()|emailusuario.isEmpty()){
            Toast alerta=Toast.makeText(getApplicationContext(),"Faltan datos",Toast.LENGTH_LONG);
            alerta.show();
        }
        else {
            //paso de parametros
            Intent intentAbrir = new Intent(this, MainActivity.class);
            intentAbrir.putExtra("intentNombreUsuario", nombreUsuario);
            intentAbrir.putExtra("intentEmailUsuario", emailusuario);
            intentAbrir.putExtra("intentTelefonoUsuario", telefonoUsuario);
            intentAbrir.putExtra("salonSeleccionado", salon);
            intentAbrir.putExtra("plato1", plato1);
            intentAbrir.putExtra("plato2", plato2);
            intentAbrir.putExtra("plato3", postre);

            startActivity(intentAbrir);

        }

    }


}
