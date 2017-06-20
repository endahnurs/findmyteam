package com.example.endah.findmyteam;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by endah on 6/19/2017.
 */

public class SignInActivity extends AppCompatActivity {
    EditText pswd,usrusr;
    TextView sup,lin;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);

        lin = (TextView) findViewById(R.id.lin);
        usrusr = (EditText) findViewById(R.id.usrusr);
        pswd = (EditText) findViewById(R.id.pswrdd);
        sup = (TextView) findViewById(R.id.sup);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");
        lin.setTypeface(custom_font1);
        sup.setTypeface(custom_font);
        usrusr.setTypeface(custom_font);
        pswd.setTypeface(custom_font);
        sup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(it);
            }
        });
    }
}
