package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by endah on 7/9/2017.
 */

public class MyTeamActivity extends Activity {
    ListView commentlist;
    String username = "Zahra Team";
    String comment = "iya disitu ?";
    int pp = R.drawable.pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment_view_activity);

        commentlist = (ListView) findViewById(R.id.commentListView);
        MyteamAdapter customAdapter = new MyteamAdapter(MyTeamActivity.this, username, pp, comment);
        commentlist.setAdapter(customAdapter);
    }
}
