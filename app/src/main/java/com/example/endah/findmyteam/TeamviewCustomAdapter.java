package com.example.endah.findmyteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by endah on 7/5/2017.
 */

public class TeamviewCustomAdapter extends BaseAdapter {
    Context context;
    String teamname[];
    int imgteam[];
    LayoutInflater inflter;

    public TeamviewCustomAdapter(Context applicationContext, String[] teamname, int[] imgteam) {
        this.context = applicationContext;
        this.teamname = teamname;
        this.imgteam = imgteam;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return teamname.length;
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
        view = inflter.inflate(R.layout.team , null);
        TextView teamnameview = (TextView)           view.findViewById(R.id.namateamview);
        ImageView pp = (ImageView) view.findViewById(R.id.ppteamview);
        teamnameview.setText(teamname[i]);
        pp.setImageResource(imgteam[i]);
        return view;
    }
}