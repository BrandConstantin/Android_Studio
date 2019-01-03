package com.example.usuario.implementacionmismaclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Registramos el escuchador
        Button boton =(Button)findViewById(R.id.button1);
        boton.setOnClickListener(this);
    }
    //Implementamos el evento
    public void onClick(View v) {
        TextView texto = (TextView)findViewById(R.id.textView1);
        texto.setText(R.string.despedida);
    }
}
