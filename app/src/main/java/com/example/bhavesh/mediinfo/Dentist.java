package com.example.bhavesh.mediinfo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Bhavesh on 3/12/2016.
 */
public class Dentist extends ActionBarActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dentist);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void onDentistButtonClick(View v) {
        if (v.getId() == R.id.vijay_vaghela) {
            Intent i = new Intent(this, Vijay_Vaghela.class);
            startActivity(i);
        }

        if (v.getId() == R.id.purvesh_chauhan) {
            Intent i = new Intent(this, Purvesh_Chauhan.class);
            startActivity(i);
        }

        if (v.getId() == R.id.hardik_shah) {
            Intent i = new Intent(this, Hardik_Shah.class);
            startActivity(i);
        }

        if (v.getId() == R.id.bhavini_patel) {
            Intent i = new Intent(this, Bhavini_Patel.class);
            startActivity(i);
        }

        if (v.getId() == R.id.kinish_patel) {
            Intent i = new Intent(this, Kinish_Patel.class);
            startActivity(i);
        }

        if (v.getId() == R.id.maulik_vora) {
            Intent i = new Intent(this, Maulik_Vora.class);
            startActivity(i);
        }
        if (v.getId() == R.id.nishit_soni) {
            Intent i = new Intent(this, Nishit_Soni.class);
            startActivity(i);
        }
        if (v.getId() == R.id.krupa_shah) {
            Intent i = new Intent(this, Krupa_Shah.class);
            startActivity(i);
        }
        if (v.getId() == R.id.b_i_patel) {
            Intent i = new Intent(this, B_I_Patel.class);
            startActivity(i);
        }
        if (v.getId() == R.id.vandana_amin) {
            Intent i = new Intent(this, Vandana_Amin.class);
            startActivity(i);
        }

    }






}