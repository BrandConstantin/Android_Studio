package constantin.brindusoiu.goodeating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    protected static final int RegistroActivity = 10;
    protected static final int SalonActivity = 10;
    protected static final int MenuActivity = 10;
    protected static final int AcercaActivity = 10;
    protected static final int AyudaActivity = 10;
    protected static final int PedidoActivity = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1=(Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(this);
        Button boton2=(Button)findViewById(R.id.boton2);
        boton2.setOnClickListener(this);
        Button boton3=(Button)findViewById(R.id.boton3);
        boton3.setOnClickListener(this);
        Button boton4=(Button)findViewById(R.id.boton4);
        boton4.setOnClickListener(this);
        Button boton5=(Button)findViewById(R.id.boton5);
        boton5.setOnClickListener(this);
        Button boton6=(Button)findViewById(R.id.boton6);
        boton6.setOnClickListener(this);
    }


    public void onClick(View view){
        abrirRegistro();
        abrirSalon();
        abrirMenu();
        abrirPedido();
        abrirAyuda();
        abrirAcerca();
    }

    public void abrirRegistro(){
        Intent intentAbrir = new Intent(this,RegistroActivity.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, RegistroActivity);
    }
    public void abrirSalon(){
        Intent intentAbrir = new Intent(this,SalonActivity.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, SalonActivity);
    }
    public void abrirMenu(){
        Intent intentAbrir = new Intent(this,MenuActivity.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, MenuActivity);
    }
    public void abrirPedido(){
        Intent intentAbrir = new Intent(this,PedidoActivity.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, PedidoActivity);
    }
    public void abrirAyuda(){
        Intent intentAbrir = new Intent(this,AyudaActivity.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, AyudaActivity);
    }
    public void abrirAcerca(){
        Intent intentAbrir = new Intent(this,AcercaActivity.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, AcercaActivity);
    }

    @Override
    protected void onActivityResult(int idPantalla, int resultCode, Intent data) {
        if (idPantalla == RegistroActivity) {
            if (resultCode == RESULT_OK) {
                String valor = (String) data.getExtras().get("retorno");
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast1.show();
            }
        }
        if (idPantalla == SalonActivity) {
            if (resultCode == RESULT_OK) {
                String valor = (String) data.getExtras().get("retorno");
                Toast toast2 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast2.show();
            }
        }
        if (idPantalla == MenuActivity) {
            if (resultCode == RESULT_OK) {
                String valor = (String) data.getExtras().get("retorno");
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast3.show();
            }
        }
        if (idPantalla == PedidoActivity) {
            if (resultCode == RESULT_OK) {
                String valor = (String) data.getExtras().get("retorno");
                Toast toast4 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast4.show();
            }
        }
        if (idPantalla == AcercaActivity) {
            if (resultCode == RESULT_OK) {
                String valor = (String) data.getExtras().get("retorno");
                Toast toast5 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast5.show();
            }
        }
        if (idPantalla == AyudaActivity) {
            if (resultCode == RESULT_OK) {
                String valor = (String) data.getExtras().get("retorno");
                Toast toast6 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast6.show();
            }
        }
    }
}