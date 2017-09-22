
package com.example.bhavesh.mediinfo;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.login)
        {
            EditText a=(EditText)findViewById(R.id.username);
            String str = a.getText().toString();
            EditText b=(EditText)findViewById(R.id.password);
            String pass = b.getText().toString();


            String password = helper.searchPass(str);
            if(pass.equals(password))
            {
                Intent i = new Intent(Login.this,Disease.class);
                startActivity(i);
            }
            else
            {
                Toast temp=Toast.makeText(Login.this,"UserName and PassWord don't match",Toast.LENGTH_SHORT);
                temp.show();
            }
        }

        if(v.getId()==R.id.signup)
        {
            Intent i = new Intent(this,SignUp.class);
            startActivity(i);
        }
    }

}
