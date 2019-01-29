package com.example.ejemplopreffragment;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

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
	}
	public void abrirActividadPreferencias(){
		Intent intentAbrir = new Intent(this,ActividadPreferences.class);
		startActivity(intentAbrir);
	}

}
