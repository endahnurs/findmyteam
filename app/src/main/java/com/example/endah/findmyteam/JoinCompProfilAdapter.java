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

public class JoinCompProfilAdapter extends BaseAdapter {
    Context context;
    String judul;
    String isi;
    int img;
    LayoutInflater inflter;

    public JoinCompProfilAdapter(Context applicationContext, String judul, int images, String isi) {
        this.context = applicationContext;
        this.isi = isi;
        this.judul = judul;
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
        view = inflter.inflate(R.layout.joinedcompprofile, null);
        TextView isiview = (TextView)           view.findViewById(R.id.contextneewsprofiltextview);
        TextView judulview = (TextView)           view.findViewById(R.id.judulprofiltextview);
        ImageView icon = (ImageView) view.findViewById(R.id.imgprofiltextview);
        judulview.setText(judul);
        isiview.setText(isi);
        icon.setImageResource(img);
        return view;
    }
}
