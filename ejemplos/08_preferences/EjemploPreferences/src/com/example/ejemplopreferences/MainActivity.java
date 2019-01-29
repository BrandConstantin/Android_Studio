package com.example.ejemplopreferences;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.SharedPreferences;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button boton=(Button)findViewById(R.id.button1);
		boton.setOnClickListener(this);	
	}

	public void onClick(View v){

		abrirActividadPreferencias();

		Button btRecuperarPref=(Button)findViewById(R.id.button2);
		btRecuperarPref.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				recuperarPreferencias();
			}
		});
	}
	public void abrirActividadPreferencias(){
		Intent intentAbrir = new Intent(this,ActividadPreferences.class);
		startActivity(intentAbrir);
	}

	public void recuperarPreferencias(){
		SharedPreferences misPreferencias = PreferenceManager.getDefaultSharedPreferences(this);
		String strNombre = misPreferencias.getString("nombre", "");
		Boolean blRebote = misPreferencias.getBoolean("rebote",false);
		String strVelocidad = misPreferencias.getString("velocidad", "");

		TextView txtResultado = (TextView) findViewById(R.id.textView1);
		txtResultado.setText("Nombre: " + strNombre + "	Rebote:   " + blRebote + " Velocidad:" + strVelocidad);
	}

}
