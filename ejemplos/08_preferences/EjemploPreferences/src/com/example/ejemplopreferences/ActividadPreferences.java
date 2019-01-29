package com.example.ejemplopreferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ActividadPreferences extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        addPreferencesFromResource(R.xml.preferencias);
    }
}
