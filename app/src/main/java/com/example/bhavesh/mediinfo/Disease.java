package com.example.bhavesh.mediinfo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Bhavesh on 3/12/2016.
 */
public class Disease extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disease);
    }

    public void onDiseaseButtonClick(View v)
    {
        if(v.getId()==R.id.dentist)
        {
            Intent i = new Intent(this,Dentist.class);
            startActivity(i);
        }

        if(v.getId()==R.id.gynecologist)
        {
            Intent i = new Intent(this,Gynecologist.class);
            startActivity(i);
        }

        if(v.getId()==R.id.dermatologist)
        {
            Intent i = new Intent(this,Dermatologist.class);
            startActivity(i);
        }

        if(v.getId()==R.id.cardiologist)
        {
            Intent i = new Intent(this,Cardiologist.class);
            startActivity(i);
        }

        if(v.getId()==R.id.g_physician)
        {
            Intent i = new Intent(this,G_Physician.class);
            startActivity(i);
        }

        if(v.getId()==R.id.neurologist)
        {
            Intent i = new Intent(this,Neurologist.class);
            startActivity(i);
        }

        if(v.getId()==R.id.psychiatrist)
        {
            Intent i = new Intent(this,Psychiatrist.class);
            startActivity(i);
        }


    }
}
