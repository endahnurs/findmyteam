package com.example.endah.findmyteam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by endah on 7/9/2017.
 */

public class AdminMenuActivity extends Activity {

    TextView newsComp;
    TextView myTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminmenu);

        newsComp = (TextView) findViewById(R.id.adminnewscom);
        myTeam = (TextView) findViewById(R.id.usersadmin);

        newsComp .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(AdminMenuActivity.this, AdminNewsActivity.class);
                startActivity(it);
            }
        });

        myTeam .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it;
                it = new Intent(AdminMenuActivity.this, MyTeamActivity.class);
                startActivity(it);
            }
        });

    }
}
