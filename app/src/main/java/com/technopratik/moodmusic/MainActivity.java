package com.technopratik.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        FragmentManager fm = getFragmentManager ();
        FragmentTransaction tx = fm.beginTransaction ();
        tx.replace( R.id.fl,new SadMood ());
        tx.commit ();






    }
    public void selectFrag( View view){
        android.app.Fragment fr;

        if(view == findViewById ( R.id.fb1 )){
            fr = new MotivitionalMood ();
        }else{
            fr = new SadMood ();
        }

        FragmentManager fm = getFragmentManager ();
        FragmentTransaction tx = fm.beginTransaction ();
        tx.replace(R.id.fl , fr);
        tx.commit ();

    }
}