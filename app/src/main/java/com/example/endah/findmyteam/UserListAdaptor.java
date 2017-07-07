package com.example.endah.findmyteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by endah on 7/8/2017.
 */

public class UserListAdaptor extends BaseAdapter {
    Context context;
    String name[];
    int pp[];
    LayoutInflater inflter;

    public UserListAdaptor(Context applicationContext, String[] name, int[] pp) {
        this.context = applicationContext;
        this.name = name;
        this.pp = pp;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return name.length;
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
        view = inflter.inflate(R.layout.listuser, null);
        TextView nama = (TextView)           view.findViewById(R.id.listusername);
        ImageView image = (ImageView) view.findViewById(R.id.listuserpoto);
        nama.setText(name[i]);
        image.setImageResource(pp[i]);
        return view;
    }
}
