package com.example.bhavesh.mediinfo;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Bhavesh on 3/12/2016.
 */
public class SignUp extends AppCompatActivity {

    DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void onSignUpClick(View v)
    {
        if(v.getId()==R.id.signupbutton)
        {
            EditText name=(EditText)findViewById(R.id.name);
            EditText email=(EditText)findViewById(R.id.email);
            EditText uname=(EditText)findViewById(R.id.uname);
            EditText pass1=(EditText)findViewById(R.id.pass1);
            EditText pass2=(EditText)findViewById(R.id.pass2);

            String namestr=name.getText().toString();
            String emailstr=email.getText().toString();
            String unamestr=uname.getText().toString();
            String pass1str=pass1.getText().toString();
            String pass2str=pass2.getText().toString();

            if(!pass1str.equals(pass2str))
            {
                //POPUP MESSAGE WHEN PASSWORD NOT MATCH
                Toast pass=Toast.makeText(SignUp.this,"Password Do not match",Toast.LENGTH_SHORT);
                pass.show();
            }
            /*else
            {
                Toast temp=Toast.makeText(SignUp.this,"Registerd SuccessFully",Toast.LENGTH_SHORT);
                temp.show();
            }*/
            else
            {
                //INSERT THE DETAIL IN DATABASE
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);

                helper.insertContact(c);
            }
        }
    }
}
