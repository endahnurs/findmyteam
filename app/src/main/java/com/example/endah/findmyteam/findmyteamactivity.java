package com.example.endah.findmyteam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by endah on 7/9/2017.
 */

public class findmyteamactivity extends Activity {
    ListView teamList;
    String teamname ="Zahra Team";
    int ppteam = R.drawable.profilpict;
    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findteamactivity);
        teamList = (ListView) findViewById(R.id.teamViewListView);
        findmyteamAdaptor customAdapter = new findmyteamAdaptor(findmyteamactivity.this, teamname, ppteam);
        teamList.setAdapter(customAdapter);

        create = (Button) findViewById(R.id.createnewteam);


        create .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(findmyteamactivity.this, CreateTeamActivity.class);
                startActivity(it);
            }
        });
    }
}
