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

public class CommentViewCustomAdapter extends BaseAdapter {

    Context context;
    String namauser[];
    String komen[];
    int imgpp[];
    LayoutInflater inflter;

    public CommentViewCustomAdapter(Context applicationContext, String[] namauser, int[] imgpp, String[] komen) {
        this.context = applicationContext;
        this.komen = komen;
        this.namauser = namauser;
        this.imgpp = imgpp;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return namauser.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.comment, null);
        TextView comment = (TextView)           view.findViewById(R.id.commenttextview);
        TextView username = (TextView)           view.findViewById(R.id.nametextview);
        ImageView ppimg = (ImageView) view.findViewById(R.id.pptextview);
        username.setText(namauser[i]);
        comment.setText(komen[i]);
        ppimg.setImageResource(imgpp[i]);
        return view;
    }
}
