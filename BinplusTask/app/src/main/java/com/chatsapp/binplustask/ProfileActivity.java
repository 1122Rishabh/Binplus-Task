package com.chatsapp.binplustask;

import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProfileActivity extends AppCompatActivity  {





ExpandableListView expandableListView;
List<String> listGroup;
HashMap<String,List<String>> listItem;
MainAdapter adapter;
    private FirebaseAuth firebaseAuth;


    private TextView textViewUserEmail;
    private Button buttonLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);





        expandableListView=findViewById(R.id.expandable_listview);
        listGroup=new ArrayList<>();
        listItem=new HashMap<>();
        adapter=new MainAdapter(this,listGroup,listItem);
        expandableListView.setAdapter(adapter);
        initListData();
    }

    private void initListData() {

        listGroup.add(getString(R.string.group1));
        listGroup.add(getString(R.string.group2));
        listGroup.add(getString(R.string.group3));
        listGroup.add(getString(R.string.group4));
        listGroup.add(getString(R.string.group5));
        listGroup.add(getString(R.string.group6));
        listGroup.add(getString(R.string.group7));
        listGroup.add(getString(R.string.group8));
        listGroup.add(getString(R.string.group9));
        listGroup.add(getString(R.string.group10));
        listGroup.add(getString(R.string.group11));
        listGroup.add(getString(R.string.group12));
        listGroup.add(getString(R.string.group13));
        listGroup.add(getString(R.string.group14));
        listGroup.add(getString(R.string.group15));

        String[] array;

        List<String> list1 =new ArrayList<>();
        array=getResources().getStringArray(R.array.group1);
        for(String item : array){
            list1.add(item);
        }

        List<String> list2=new ArrayList<>();
        array=getResources().getStringArray(R.array.group2);
        for(String item : array){
            list2.add(item);
        }

        List<String> list3=new ArrayList<>();
        array=getResources().getStringArray(R.array.group3);
        for(String item : array){
            list3.add(item);
        }

        List<String> list4=new ArrayList<>();
        array=getResources().getStringArray(R.array.group4);
        for(String item : array){
            list4.add(item);
        }

        List<String> list5=new ArrayList<>();
        array=getResources().getStringArray(R.array.group5);
        for(String item : array){
            list5.add(item);


        }

        listItem.put(listGroup.get(0),list1);
        listItem.put(listGroup.get(1),list2);
        listItem.put(listGroup.get(2),list3);
        listItem.put(listGroup.get(3),list4);
        listItem.put(listGroup.get(4),list5);
        adapter.notifyDataSetChanged();
    }
}
