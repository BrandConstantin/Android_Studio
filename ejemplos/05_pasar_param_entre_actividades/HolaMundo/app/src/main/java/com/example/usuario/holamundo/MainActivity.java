package com.example.usuario.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    protected static final int PANTALLA2 = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=(Button)findViewById(R.id.button);
        boton.setOnClickListener(this);
    }
    public void onClick(View v){
        abrirActividad2();
    }

    public void abrirActividad2(){
        Intent intentAbrir = new Intent(this,Pantalla2.class);
        intentAbrir.putExtra("miNombre", "Pepito");
        startActivityForResult(intentAbrir, PANTALLA2);
    }

    @Override
    protected void onActivityResult(int idPantalla, int resultCode, Intent data) {
        if (idPantalla == PANTALLA2){
            if (resultCode == RESULT_OK){
                String valor = (String) data.getExtras().get("retorno");
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                valor, Toast.LENGTH_SHORT);

                toast1.show();
            }
        }
    }
}
