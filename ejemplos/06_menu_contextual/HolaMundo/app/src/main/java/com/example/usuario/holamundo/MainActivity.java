package com.example.usuario.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    protected static final int PANTALLA2 = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=(Button)findViewById(R.id.button);
        boton.setOnClickListener(this);
        TextView etiqueta = (TextView)findViewById(R.id.textView2);

        registerForContextMenu(etiqueta);
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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(),
                        "Has pulsado la opción 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(),
                        "Has pulsado la opción 2", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mcontextualetiqueta, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opCtx1:
                Toast.makeText(getApplicationContext(),
                        "Opción 1 del menú contextual", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opCtx2:
                Toast.makeText(getApplicationContext(),
                        "Opción 2 del menú contextual", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
