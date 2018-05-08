package com.example.xfeng.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChooseListActivity extends AppCompatActivity {

    AllLists alllist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_list);


        TextView viewTitle = findViewById(R.id.ShowTitles);
        if (alllist==null){
            String temp = "No list has been created.";
            viewTitle.setText(temp);
        }
        else{
            String allTitles = alllist.returnAllTitles();
            viewTitle.setText(allTitles);
        }

    }


}
