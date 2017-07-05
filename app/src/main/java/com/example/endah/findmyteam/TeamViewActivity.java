package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by endah on 7/5/2017.
 */

public class TeamViewActivity extends Activity {
    ListView teamList;
    String teamname[] = {"India", "China", "australia", "Portugle", "America", "NewZealand", "India", "China", "australia", "Portugle", "America", "NewZealand"};
    int ppteam[] = {R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_view_activity);
        teamList = (ListView) findViewById(R.id.teamViewListView);
        TeamviewCustomAdapter customAdapter = new TeamviewCustomAdapter(getApplicationContext(), teamname, ppteam);
        teamList.setAdapter(customAdapter);
    }
}
