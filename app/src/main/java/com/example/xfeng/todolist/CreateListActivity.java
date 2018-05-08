package com.example.xfeng.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateListActivity extends AppCompatActivity {
    AllLists alllists = new AllLists();
    Button button1;
    Button button2;
    String title;
    EditText titleinput;
    ToDoList todolist;
    EditText iteminput;
    String item;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);



    }

    public void enterTitleButton(View view){
        titleinput = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button);
        title = titleinput.getText().toString();
        titleinput.setText(title);
        todolist = new ToDoList(title);
        alllists.addList(todolist);
    }

    public void newItemButton(View view){
        iteminput = (EditText) findViewById(R.id.editText3);
        button2 = (Button) findViewById(R.id.button2);
        item = iteminput.getText().toString();
        iteminput.setText(item);
        todolist.add(item);
    }
}
