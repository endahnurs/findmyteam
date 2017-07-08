package com.example.endah.findmyteam;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by endah on 7/4/2017.
 */

public class NewsCustomAdapter extends BaseAdapter {
    NewsCompActivity context;
    String judular[];
    String isi[];
    int img[];
    LayoutInflater inflter;

    public NewsCustomAdapter(NewsCompActivity applicationContext, String[] judul, int[] images, String[] isi) {
        this.context = applicationContext;
        this.isi = isi;
        this.judular = judul;
        this.img = images;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return judular.length;
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
        view = inflter.inflate(R.layout.news, null);
        TextView isiview = (TextView)           view.findViewById(R.id.contextneews);
        TextView judulview = (TextView)           view.findViewById(R.id.judulnews);
        ImageView icon = (ImageView) view.findViewById(R.id.imgnews);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buka intent yang diinginkan (contoh sign in activity)
                Intent detail = new Intent(context, SignInActivity.class);
                context.startActivity(detail);
                Log.d("hasil clikc", isi[i]);
            }
        });
        judulview.setText(judular[i]);
        isiview.setText(isi[i]);
        icon.setImageResource(img[i]);
        return view;
    }
}
