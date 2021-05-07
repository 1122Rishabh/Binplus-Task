package com.chatsapp.binplustask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chatsapp.binplustask.Fragments.pagefragment1;
import com.chatsapp.binplustask.Fragments.pagefragment2;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

private ViewPager pager;
private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list=new ArrayList<>();
        list.add(new pagefragment1());
        list.add(new pagefragment2());


        pager=findViewById(R.id.pager);
        pagerAdapter = new ViewpagerAdapter(getSupportFragmentManager(),list);


        pager.setAdapter(pagerAdapter);
    }


}