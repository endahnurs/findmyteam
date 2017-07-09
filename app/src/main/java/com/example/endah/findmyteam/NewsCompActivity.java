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
    String judul = "ITCC 2017 Information Technology Creative";
    String contentNews = "Himpunan Mahasiswa Teknologi Informasi (HMTI -Udayana) menyelenggarakan sebuah acara tahunan: ITCC";
    int flags = R.drawable.posterlombakecil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_comp_activity);
        newsList = (ListView) findViewById(R.id.newsSimpleListView);
        NewsCustomAdapter customAdapter = new NewsCustomAdapter(NewsCompActivity.this, judul, flags, contentNews);
        newsList.setAdapter(customAdapter);

    }
}
