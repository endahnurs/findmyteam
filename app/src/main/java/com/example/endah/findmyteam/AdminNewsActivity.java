package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by endah on 7/9/2017.
 */

public class AdminNewsActivity extends Activity{

    ListView newsList;
    String judul = "ITCC 2017 Information Technology Creative";
    String contentNews = "Himpunan Mahasiswa Teknologi Informasi (HMTI -Udayana) menyelenggarakan sebuah acara tahunan: ITCC";
    int flags = R.drawable.posterlombakecil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_admin_activity);
        newsList = (ListView) findViewById(R.id.adminnewsSimpleListView);
        AdminNewsAdapter customAdapter = new AdminNewsAdapter(AdminNewsActivity.this, judul, flags, contentNews);
        newsList.setAdapter(customAdapter);

    }
}
