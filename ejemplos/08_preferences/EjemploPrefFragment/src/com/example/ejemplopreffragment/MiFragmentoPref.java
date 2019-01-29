package com.example.ejemplopreffragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MiFragmentoPref extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         addPreferencesFromResource(R.xml.preferencias);
    }
}
