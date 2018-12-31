package com.example.ejemplotabs;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.widget.TabHost;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources res = getResources();
		 
		TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
		tabs.setup();
		 
		TabHost.TabSpec spec=tabs.newTabSpec("recibidas");
		spec.setContent(R.id.tab1);
		spec.setIndicator("Llamadas recibidas",
		    res.getDrawable(android.R.drawable.sym_call_incoming));
		tabs.addTab(spec);
		 
		spec=tabs.newTabSpec("enviadas");
		spec.setContent(R.id.tab2);
		spec.setIndicator("Llamadas enviadas",
		    res.getDrawable(android.R.drawable.sym_call_outgoing));
		tabs.addTab(spec);
		 
		spec=tabs.newTabSpec("perdidas");
		spec.setContent(R.id.tab3);
		spec.setIndicator("Llamadas Perdidas",
		    res.getDrawable(android.R.drawable.sym_call_missed));
		tabs.addTab(spec);
		
		tabs.setCurrentTab(0);		
	}
}
