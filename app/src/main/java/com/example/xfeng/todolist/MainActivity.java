package com.example.xfeng.todolist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    String title;
    String text;
    Button submitButton;

    ToDoList todolist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView img = (ImageView) findViewById(R.id.background) ;
//        img.setImageResource(R.drawable.bkg);


    }

    public void ViewListButton(View view) {
        Intent intent = new Intent(this, ChooseListActivity.class);
        startActivity(intent);



    }

    public void CreateListButton(View view){
        Intent intent = new Intent(this, CreateListActivity.class);
        startActivity(intent);
    }

}
