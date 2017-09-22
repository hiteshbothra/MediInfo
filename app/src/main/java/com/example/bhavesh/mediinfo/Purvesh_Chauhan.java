package com.example.bhavesh.mediinfo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bhavesh on 4/6/2016.
 */
public class Purvesh_Chauhan extends ActionBarActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purvesh_chauhan);
        b = (Button)findViewById(R.id.track);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                String s1 = "23.022505";
                String s2 = "72.5713621";
                i.putExtra("name1", s1);
                i.putExtra("name2", s2);
                startActivity(i);
            }
        });
    }
}

