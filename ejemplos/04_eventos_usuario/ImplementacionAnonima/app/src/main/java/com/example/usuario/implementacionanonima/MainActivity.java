package com.example.usuario.implementacionanonima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button)findViewById(R.id.button1);
        boton.setOnClickListener(miEscuchador); // Registramos el escuchador.
    }
    //Implementamos  el evento dentro del Listener
    private OnClickListener miEscuchador = new OnClickListener() {
        public void onClick(View v) {
            TextView texto = (TextView)findViewById(R.id.textView1);
            texto.setText(R.string.despedida);
        }
    };
}
