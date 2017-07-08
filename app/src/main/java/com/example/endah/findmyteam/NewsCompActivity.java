package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by endah on 7/4/2017.
 */

public class NewsCompActivity extends AppCompatActivity {
    ListView newsList;
    String judul[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    String contentNews[] = {"IndiaIndiaIndiaIndiaIndiaIndia", "ChinaChinaChinaChina", "australiaaustraliaaustraliaaustraliaaustralia", "PortuglePortuglePortuglePortugle", "America", "NewZealand"};
    int flags[] = {R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_comp_activity);
        newsList = (ListView) findViewById(R.id.newsSimpleListView);
        NewsCustomAdapter customAdapter = new NewsCustomAdapter(getApplicationContext(), judul, flags, contentNews);
        newsList.setAdapter(customAdapter);

        newsList.setOnClickListener(new NewsCompActivity() {
            @Override
            public void onItemClick (View v) {
                Toast.makeText(getApplicationContext(), "hahah", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
