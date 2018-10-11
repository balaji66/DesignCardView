package com.durga.balaji66.designcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ModelClass> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        addItemsToList();
        recyclerView.setLayoutManager( new GridLayoutManager(MainActivity.this,1));
        RecyclerViewAdapter adapter =new RecyclerViewAdapter(this,list);
        recyclerView.setAdapter(adapter);
    }

    public void initializeViews() {
        recyclerView =findViewById(R.id.recyclerView);
    }
    public void addItemsToList()
    {
        list.add(0, new ModelClass("Google.com","Balaji","1231231231","balaji@gmail.com"));
        list.add(1, new ModelClass("Google.com","Rohit","1111111111","rohit@gmail.com"));
        list.add(2, new ModelClass("Google.com","Kiran","2222222222","kiran@gmail.com"));
        list.add(3, new ModelClass("Google.com","Prashanth","3333333333","prashanth@gmail.com"));
        list.add(4, new ModelClass("Google.com","Amit","4444444444","amit@gmail.com"));
        list.add(5, new ModelClass("Google.com","Roshan","5555555555","roshan@gmail.com"));



    }


}
