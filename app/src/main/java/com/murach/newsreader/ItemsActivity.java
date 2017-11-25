package com.murach.newsreader;


import android.os.Bundle;
import android.app.Activity;


public class ItemsActivity extends Activity implements ItemsFragment.ItemsFragmentListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
    }
    public void createItems(){
        ItemsFragment itemsFragment = (ItemsFragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);
    }

}