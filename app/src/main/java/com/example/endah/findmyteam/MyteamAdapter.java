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

public class MyteamAdapter extends BaseAdapter {
    Context context;
    String user;
    String chat;
    int img;
    LayoutInflater inflter;

    public MyteamAdapter(Context applicationContext, String judul, int images, String isi) {
        this.context = applicationContext;
        this.chat = isi;
        this.user = judul;
        this.img = images;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.myteam, null);
        TextView isichat = (TextView)           view.findViewById(R.id.isichat);
        TextView namateam = (TextView)           view.findViewById(R.id.namateam);
        ImageView icon = (ImageView) view.findViewById(R.id.ppgroup);
        namateam.setText(user);
        isichat.setText(chat);
        icon.setImageResource(img);

        namateam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buka intent yang diinginkan (contoh sign in activity)
                Intent detail = new Intent(context, ChatActivity.class);
                context.startActivity(detail);
            }
        });
        return view;
    }
}
