package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by endah on 7/7/2017.
 */

public class ProfileUserActivity extends Activity {
    ListView newsList;
    String judul[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    String contentNews[] = {"IndiaIndiaIndiaIndiaIndiaIndia", "ChinaChinaChinaChina", "australiaaustraliaaustraliaaustraliaaustralia", "PortuglePortuglePortuglePortugle", "America", "NewZealand"};
    int pict[] = {R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        newsList = (ListView) findViewById(R.id.joidcompListView);
        JoinCompProfilAdapter customAdapter = new JoinCompProfilAdapter(getApplicationContext(), judul, pict, contentNews);
        newsList.setAdapter(customAdapter);
    }
}
