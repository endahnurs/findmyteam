package com.example.endah.findmyteam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by endah on 7/8/2017.
 */

public class NewsDetile extends Activity {

    TextView create;
    TextView comment;
    TextView join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_view_activity);

        create = (TextView) findViewById(R.id.createteamtextview);
        comment = (TextView) findViewById(R.id.commenttextview2);
        join = (TextView) findViewById(R.id.jointeam);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(NewsDetile.this, CreateTeamActivity.class);
                startActivity(it);
            }
        });
        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(NewsDetile.this, CommentViewActivity.class);
                startActivity(it);
            }
        });

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(NewsDetile.this, TeamViewActivity.class);
                startActivity(it);
            }
        });
    }
}
