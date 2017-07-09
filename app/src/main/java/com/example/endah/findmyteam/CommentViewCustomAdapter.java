package com.example.endah.findmyteam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
 * Created by endah on 7/5/2017.
 */

public class CommentViewCustomAdapter extends BaseAdapter {

    CommentViewActivity context;
    String namauser;
    String komen;
    int imgpp;
    LayoutInflater inflter;

    public CommentViewCustomAdapter(CommentViewActivity applicationContext, String namauser, int imgpp, String komen) {
        this.context = applicationContext;
        this.komen = komen;
        this.namauser = namauser;
        this.imgpp = imgpp;
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



    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.comment, null);
        TextView comment = (TextView)           view.findViewById(R.id.commenttextview);
        TextView username = (TextView)           view.findViewById(R.id.nametextview);
        ImageView ppimg = (ImageView) view.findViewById(R.id.ppteam);
        username.setText(namauser);
        comment.setText(komen);
        ppimg.setImageResource(imgpp);

        username.setOnClickListener(new View.OnClickListener() {
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
