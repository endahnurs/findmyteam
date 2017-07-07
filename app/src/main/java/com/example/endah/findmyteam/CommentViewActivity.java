package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by endah on 7/5/2017.
 */

public class CommentViewActivity extends Activity {
    ListView commentlist;
    String username[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    String comment[] = {"IndiaIndiaIndiaIndiaIndiaIndia", "ChinaChinaChinaChina", "australiaaustraliaaustraliaaustraliaaustralia", "PortuglePortuglePortuglePortugle", "America", "NewZealand"};
    int pp[] = {R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment_view_activity);

        commentlist = (ListView) findViewById(R.id.commentListView);
        CommentViewCustomAdapter customAdapter = new CommentViewCustomAdapter(getApplicationContext(), username, pp, comment);
        commentlist.setAdapter(customAdapter);
    }
}
