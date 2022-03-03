package com.example.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ListView extends BaseAdapter {

    @Override
    public int getCount() {
        return 0;
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
    public View getView(int i, View convertView, ViewGroup parent) {
         View view = null;
         if(convertView ==null){
             view = View.inflate(parent.getContext(), R.layout.menu_frag, null);
         }else view = convertView;



        return null;
    }
}
