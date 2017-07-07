package com.example.endah.findmyteam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by endah on 7/8/2017.
 */

public class userlistAcitvity extends Activity{

    ListView userList;
    String name[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int pictp[] = {R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlistactivity);
        userList = (ListView) findViewById(R.id.userListView);
        UserListAdaptor customAdapter = new UserListAdaptor(getApplicationContext(), name, pictp);
        userList.setAdapter(customAdapter);

    }
}
