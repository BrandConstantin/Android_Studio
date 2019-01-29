package com.example.ejemplopreffragment;

import android.app.Activity;
import android.os.Bundle;


public class ActividadPreferences extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new MiFragmentoPref())
                .commit();
    }
}
