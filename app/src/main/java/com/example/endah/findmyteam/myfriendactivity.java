package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by endah on 7/9/2017.
 */

public class myfriendactivity extends Activity{
    ListView commentlist;
    String username = "Endahnurs";
    int pp = R.drawable.pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfriend);

        commentlist = (ListView) findViewById(R.id.listmyfriend);
        MyFriendAdaptor customAdapter = new MyFriendAdaptor(myfriendactivity.this, username, pp);
        commentlist.setAdapter(customAdapter);
    }
}
