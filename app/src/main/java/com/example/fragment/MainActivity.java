package com.example.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MenuFrag.IFragmentClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override public void onMenuItemClick(int position) {
        ContentFrag content =
                (ContentFrag)getSupportFragmentManager().findFragmentById(R.id.contentfrag);
        if(content!=null)
            content.updateContent(position);
    }
}