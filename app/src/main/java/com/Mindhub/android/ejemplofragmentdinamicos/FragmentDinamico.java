package com.Mindhub.android.ejemplofragmentdinamicos;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public class FragmentDinamico extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamyc_fragments);

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();

        if(d.getRotation() == Surface.ROTATION_90){
            Fragment1 fragment1 = new Fragment1();
            fragmentTransaction.replace(android.R.id.content, fragment1).commit();
        }else{
            Fragment2 fragment2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content, fragment2).commit();
        }
    }
}