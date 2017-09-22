package com.example.bhavesh.mediinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Bhavesh on 3/12/2016.
 */
public class Gynecologist extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gynecologist);
    }

    public void onGynecologistButtonClick(View v)
    {
        if(v.getId()==R.id.krupa_shah)
        {
            Intent i =new Intent(this,Krupa_Shah.class);
            startActivity(i);
        }

        if(v.getId()==R.id.b_i_patel)
        {
            Intent i =new Intent(this,B_I_Patel.class);
            startActivity(i);
        }

        if(v.getId()==R.id.vandana_amin)
        {
            Intent i =new Intent(this,Vandana_Amin.class);
            startActivity(i);
        }

        if(v.getId()==R.id.bhavini_patel)
        {
            Intent i =new Intent(this,Bhavini_Patel.class);
            startActivity(i);
        }

        if(v.getId()==R.id.kinish_patel)
        {
            Intent i =new Intent(this,Kinish_Patel.class);
            startActivity(i);
        }

        if(v.getId()==R.id.maulik_vora)
        {
            Intent i =new Intent(this,Maulik_Vora.class);
            startActivity(i);
        }

        if(v.getId()==R.id.nishit_soni)
        {
            Intent i =new Intent(this,Nishit_Soni.class);
            startActivity(i);
        }
    }
}
