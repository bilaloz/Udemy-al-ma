package com.example.windows10.udemy;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

    String dizim [] = {"HosgeldinActivty","MainActivity","ListeOrnek","Weightsum"};
    ArrayAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter(Menu.this,android.R.layout.simple_list_item_1,dizim);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String secilen = dizim[position];
        Class bilmem ;
        try {
            bilmem = Class.forName("com.example.windows10.udemy."+secilen);
            Intent intent = new Intent(this,bilmem);
            startActivity(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
