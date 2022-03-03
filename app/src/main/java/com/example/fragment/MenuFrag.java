package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

public class MenuFrag extends ListFragment {
    String[] menus = {"Flowers","Animals","Foods"};
    IFragmentClickListener itemFragment;

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.menu_frag,container,false);
        ArrayAdapter adapter  = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, menus);
        setListAdapter(adapter);
        return view;
    }
    public interface IFragmentClickListener{
        void onMenuItemClick(int position);
    }
    @Override public void onAttach(@NonNull Context context) {

        super.onAttach(context);

        try{ itemFragment = (IFragmentClickListener) context;}
        catch (ClassCastException e){e.printStackTrace();}
    }

//    @Override
//    public void onListItemClick(ListView l, View v, int position, long id){
//        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);
//        txt.change("Name: "+ users[position],"Location : "+ location[position]);
//        getListView().setSelector(android.R.color.holo_blue_dark);
//    }
}

