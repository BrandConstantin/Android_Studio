package com.example.usuario.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Pantalla2 extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Button boton=(Button)findViewById(R.id.button2);
        boton.setOnClickListener(this);

        Intent intentRecibir = getIntent();
        String cadena = (String)intentRecibir.getExtras().get("miNombre");

        TextView mensaje=(TextView)findViewById(R.id.textView);
        String despedida = (String)mensaje.getText();
        mensaje.setText(despedida + " " + cadena);

    }

    public void onClick(View v){

        Intent data = new Intent();
        data.putExtra("retorno", "Venimos de la Pantalla2");
        setResult(RESULT_OK, data);
        finish();

    }


}
