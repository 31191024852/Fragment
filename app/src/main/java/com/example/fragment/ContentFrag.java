package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class ContentFrag extends Fragment {
    GridView gridView;
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.content_frag, container, false);
        gridView = view.findViewById(R.id.gridview);
        return view;
    }
    public void updateContent(int position){
        switch (position){
            case 0:

                break;
            case 1:
                break;
            case 2:
                break;
        }
    }


}
