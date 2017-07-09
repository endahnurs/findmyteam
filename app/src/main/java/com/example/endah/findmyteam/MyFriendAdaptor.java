package com.example.endah.findmyteam;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by endah on 7/9/2017.
 */

public class MyFriendAdaptor extends BaseAdapter {

    Context context;
    String user;
    int img;
    LayoutInflater inflter;

    public MyFriendAdaptor(Context applicationContext, String judul, int images) {
        this.context = applicationContext;
        this.user = judul;
        this.img = images;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.myfriendactivity, null);
        TextView namateam = (TextView)           view.findViewById(R.id.usernamemyfriend);
        ImageView icon = (ImageView) view.findViewById(R.id.ppmyfriendactivity);
        namateam.setText(user);
        icon.setImageResource(img);

        namateam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buka intent yang diinginkan (contoh sign in activity)
                Intent detail = new Intent(context, ProfileUserActivity.class);
                context.startActivity(detail);
            }
        });
        return view;
    }
}
