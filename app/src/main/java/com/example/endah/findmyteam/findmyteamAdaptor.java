package com.example.endah.findmyteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by endah on 7/9/2017.
 */

public class findmyteamAdaptor extends BaseAdapter {
    Context context;
    String teamname;
    int imgteam;
    LayoutInflater inflter;

    public findmyteamAdaptor(Context applicationContext, String teamname, int imgteam) {
        this.context = applicationContext;
        this.teamname = teamname;
        this.imgteam = imgteam;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return 10;
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
        view = inflter.inflate(R.layout.findteam , null);
        TextView teamnameview = (TextView)           view.findViewById(R.id.findteamnamagroup);
        ImageView pp = (ImageView) view.findViewById(R.id.findteampp);
        teamnameview.setText(teamname);
        pp.setImageResource(imgteam);
        return view;
    }
}
