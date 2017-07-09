package com.example.endah.findmyteam;

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

public class AdminNewsAdapter extends BaseAdapter {

    AdminNewsActivity context;
    String judular;
    String isi;
    int img;
    LayoutInflater inflter;


    public AdminNewsAdapter(AdminNewsActivity applicationContext, String judul, int images, String isi) {
        this.context = applicationContext;
        this.isi = isi;
        this.judular = judul;
        this.img = images;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return 10;
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
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.news_admin, null);
        TextView isiview = (TextView)           view.findViewById(R.id.admincontent);
        TextView judulview = (TextView)           view.findViewById(R.id.adminjudul);
        ImageView icon = (ImageView) view.findViewById(R.id.adminimg);
        judulview.setText(judular);
        isiview.setText(isi);
        icon.setImageResource(img);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buka intent yang diinginkan (contoh sign in activity)
                Intent detail = new Intent(context, NewsDetile.class);
                context.startActivity(detail);
            }
        });
        return view;
    }
}
