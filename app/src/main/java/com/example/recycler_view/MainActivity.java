package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Friends> friendsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends f0 = new Friends(1,"Imran Khan", 1980, "Gilgit",R.drawable.d);
        Friends f1 = new Friends(2,"Thomas Odean", 1981, "Lahore",R.drawable.c);
        Friends f2 = new Friends(3,"Bill Gates", 1980, "Quetta",R.drawable.b);
        Friends f3 = new Friends(4,"Chris Jordan",1987,"Peshawar",R.drawable.a);
        Friends f4 = new Friends(5,"Babar Azam", 1980, "Karachi",R.drawable.c);
        Friends f5 = new Friends(6,"Zia Ul Haq",1987,"Faisalabad ",R.drawable.a);
        Friends f6 = new Friends(7,"Badar", 1980, "Rawalpindi",R.drawable.d);
        Friends f7 = new Friends(8,"Hashim",1997,"Karachi",R.drawable.b);
        Friends f8 = new Friends(8,"Salman",1980,"Quetta",R.drawable.c);
        Friends f9 = new Friends(8,"Rizwan",1982,"Kasur",R.drawable.d);
        Friends f10 = new Friends(8,"Junaid",1977,"Islamabad",R.drawable.a);
        Friends f11 = new Friends(8,"Waseem",1967,"Rawalpindi",R.drawable.b);
        Friends f12 = new Friends(9,"Iqrar Hussain", 2000, "Okara", R.drawable.c);

        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11, f12}));

        recyclerView = findViewById(R.id.myRecyclerView);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
    }
}