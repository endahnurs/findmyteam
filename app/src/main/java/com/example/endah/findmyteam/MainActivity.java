package com.example.endah.findmyteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView newsComp;
    TextView myTeam;
    TextView FindPeople;
    TextView history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsComp = (TextView) findViewById(R.id.newscomptxtview);
        myTeam = (TextView) findViewById(R.id.myteamtxtview);
        FindPeople = (TextView) findViewById(R.id.findpeopletxtview);
        history = (TextView) findViewById(R.id.historytxtview);

        newsComp .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(MainActivity.this, NewsCompActivity.class);
                startActivity(it);
            }
        });
        myTeam .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(MainActivity.this, TeamViewActivity.class);
                startActivity(it);
            }
        });
    }
}
