package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by endah on 7/5/2017.
 */

public class CommentViewActivity extends AppCompatActivity {
    ListView commentlist;
    String username = "Endahnurs";
    String comment = "wah mantap nih gan. gimana cara daftarnya. ada yang mau gabung team ku ?";
    int pp = R.drawable.pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment_view_activity);

        commentlist = (ListView) findViewById(R.id.commentListView);
        CommentViewCustomAdapter customAdapter = new CommentViewCustomAdapter(CommentViewActivity.this, username, pp, comment);
        commentlist.setAdapter(customAdapter);
    }
}
