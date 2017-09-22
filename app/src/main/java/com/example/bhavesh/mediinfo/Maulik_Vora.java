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
public class Maulik_Vora extends ActionBarActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maulik_vora);

        b = (Button)findViewById(R.id.track);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                String s1 = "25.769";
                String s2 = "71.369";
                i.putExtra("name1", s1);
                i.putExtra("name2", s2);
                startActivity(i);
            }
        });
    }
}
